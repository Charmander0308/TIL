/* ===========================================================
   SSAFY View 맛보기 실습 스크립트 (idempotent)
   - 개념: "뷰 = 저장된 SELECT(가상 테이블)"
   - 범위: 읽기 중심. DML/업데이트 뷰는 이후 차시.
   - 실행 순서: 위에서 아래로 그대로 실행
   =========================================================== */

-- 0) 환경 고정
USE SSAFY_CORPORATION;

-- (선택) 엄격한 그룹 규칙을 보고 싶으면 주석 해제
-- SET sql_mode = 'ONLY_FULL_GROUP_BY';

-- 참고: 현재 테이블 확인
-- SHOW TABLES;
-- DESC EMP;
-- DESC DEPT;
-- DESC SALGRADE;

/* -----------------------------------------------------------
   1) 필터링 뷰: 영업직(SALESMAN)만 보기
   ----------------------------------------------------------- */
DROP VIEW IF EXISTS v_sales_only;
CREATE VIEW v_sales_only AS
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE JOB = 'SALESMAN';

-- 사용 예: 높은 급여 순
SELECT * FROM v_sales_only ORDER BY SAL DESC;

/* -----------------------------------------------------------
   2) 컬럼 노출 최소화: 필요한 컬럼만 공개
   ----------------------------------------------------------- */
DROP VIEW IF EXISTS v_emp_public;
CREATE VIEW v_emp_public AS
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP;

-- 사용 예: 이름/급여만 안전 출력
SELECT ENAME, SAL
FROM v_emp_public
ORDER BY SAL DESC;

/* -----------------------------------------------------------
   3) (예고편) JOIN 캡슐화: 직원 + 부서 정보
   조인의 진가를 "뷰로 한 번만" 정의하고 재사용
   ----------------------------------------------------------- */
DROP VIEW IF EXISTS v_emp_dept;
CREATE VIEW v_emp_dept AS
SELECT
  e.EMPNO, e.ENAME, e.JOB, e.SAL, e.DEPTNO,
  d.DNAME, d.LOC
FROM EMP e
JOIN DEPT d ON e.DEPTNO = d.DEPTNO;

-- 사용 예: 부서별 평균 급여
SELECT DNAME, ROUND(AVG(SAL),2) AS avg_sal, COUNT(*) AS emp_cnt
FROM v_emp_dept
GROUP BY DNAME
ORDER BY avg_sal DESC;

-- 사용 예: 부서별 합계 + 총계(ROLLUP)
SELECT
  IF(GROUPING(DNAME)=1, 'ALL_DEPTS', DNAME) AS dept_or_total,
  SUM(SAL) AS total_sal
FROM v_emp_dept
GROUP BY DNAME WITH ROLLUP
ORDER BY GROUPING(DNAME), DNAME;

/* -----------------------------------------------------------
   4) 룩업(참조) 구간 라벨링: 급여등급 붙인 뷰
   (SALGRADE의 구간 정의 사용)
   ----------------------------------------------------------- */
DROP VIEW IF EXISTS v_emp_with_grade;
CREATE VIEW v_emp_with_grade AS
SELECT
  e.EMPNO, e.ENAME, e.JOB, e.SAL, e.DEPTNO,
  g.GRADE
FROM EMP e
LEFT JOIN SALGRADE g
  ON e.SAL BETWEEN g.LOSAL AND g.HISAL;

-- 사용 예: 등급별 인원수/평균
SELECT GRADE,
       COUNT(*) AS n,
       ROUND(AVG(SAL),2) AS avg_sal
FROM v_emp_with_grade
GROUP BY GRADE
ORDER BY GRADE;

/* -----------------------------------------------------------
   5) HAVING 예시 (집계 결과 필터)
   ----------------------------------------------------------- */
-- 평균 급여 ≥ 2000 이면서 인원 ≥ 3인 부서만
SELECT DNAME,
       COUNT(*) AS emp_cnt,
       ROUND(AVG(SAL),2) AS avg_sal
FROM v_emp_dept
GROUP BY DNAME
HAVING AVG(SAL) >= 2000 AND COUNT(*) >= 3
ORDER BY DNAME;

/* -----------------------------------------------------------
   6) (선택) 피벗 맛보기: 부서 × 직무 인원수 매트릭스
   - MySQL은 PIVOT 키워드가 없어 조건부 집계로 구현
   ----------------------------------------------------------- */
SELECT
  DNAME AS dept,
  SUM(CASE WHEN JOB='CLERK'     THEN 1 ELSE 0 END) AS CLERK,
  SUM(CASE WHEN JOB='SALESMAN'  THEN 1 ELSE 0 END) AS SALESMAN,
  SUM(CASE WHEN JOB='MANAGER'   THEN 1 ELSE 0 END) AS MANAGER,
  SUM(CASE WHEN JOB='ANALYST'   THEN 1 ELSE 0 END) AS ANALYST,
  SUM(CASE WHEN JOB='PRESIDENT' THEN 1 ELSE 0 END) AS PRESIDENT,
  COUNT(*) AS TOTAL
FROM v_emp_dept
GROUP BY DNAME
ORDER BY DNAME;