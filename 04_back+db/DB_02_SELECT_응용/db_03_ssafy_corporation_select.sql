USE SSAFY_CORPORATION;

# LIMIT : 개수를 제한하여 보여주고 싶을 때 ORDER BY 함께 사용하면 상위, 하위
SELECT *
FROM emp
ORDER BY sal DESC
LIMIT 5;

SELECT *
FROM emp
ORDER BY sal DESC
LIMIT 5, 5; -- 5명 제끼고 그 다음 5명










-- 1) COUNT의 차이: COUNT(*) vs COUNT(col)
--    - COUNT(*) : 모든 행 (NULL 포함) 개수
--    - COUNT(col): 해당 컬럼이 NULL이 아닌 행만
SELECT 
	COUNT(*) AS rows_all,
    COUNT(sal), 
    COUNT(comm)
FROM emp;




-- 2) SUM/AVG의 NULL 무시 특성
--    - SUM/AVG은 기본적으로 NULL을 계산에서 제외함
SELECT SUM(sal), SUM(comm), ROUND(AVG(SAL),2), AVG(COMM)
FROM emp;



-- 3) '커미션을 0으로 간주한' 평균
--    - IFNULL/COALESCE로 NULL을 0으로 치환해서 평균에 반영
SELECT 
	ROUND(AVG(sal+ifnull(comm, 0)),2) AS ifnull_avg,
	ROUND(AVG(sal+coalesce(comm, 0)),2) AS ifnull_avg
FROM emp;


-- 4) MIN/MAX 기본 사용
SELECT
	MIN(sal), MAX(sal)
FROM emp;


-- 5) DISTINCT와 함께: 서로 다른 직무 수
SELECT COUNT(DISTINCT job)
FROM emp;






-- 6) 한 번에 여러 지표 요약해서 레포트처럼 보기
SELECT 
	COUNT(*) AS emp_cnt,
    COUNT(DISTINCT job) AS jobs_cnt,
    SUM(sal)	AS total_sal,
    ROUND(AVG(sal),2)	AS avg_sal,
    MIN(SAL),
    MAX(SAL),
	ROUND(AVG(sal+ifnull(comm, 0)),2) AS ifnull_avg
FROM emp;

-- 7) 부서별 급여 요약 (DEPTNO 기준)
SELECT
	deptno,
    COUNT(*) AS emp_cnt,
    SUM(sal),
    MAX(sal)
FROM emp
GROUP BY deptno;


-- 8) 직무별 인원/평균 급여
SELECT
	job,
    COUNT(*) AS N,
    ROUND(AVG(sal), 2) AS avg_sal
FROM emp
GROUP BY job;


-- 9) 입사 연도별 인원수
SELECT YEAR(hiredate) AS hire_year, COUNT(*)
FROM emp
GROUP BY YEAR(hiredate)
ORDER BY hire_year;



-- 10) WHERE로 전처리 후 GROUP BY (성능/의미상 권장)
--     예) 1981년 입사자만 대상으로 부서별 인원
SELECT deptno, COUNT(*)
FROM emp
WHERE YEAR(hiredate) = 1981
GROUP BY deptno;


-- 11) 부서별 평균급여 ≥ 2000 AND 인원 ≥ 3
SELECT deptno, COUNT(*), AVG(sal) 
FROM emp
GROUP BY deptno
HAVING AVG(sal) >= 2000 AND COUNT(*) >= 3;


-- 12) WHERE + HAVING 함께 쓰기 (역할 분리)
--      WHERE: 그룹 전 필터 / HAVING: 그룹 후 집계조건 필터
-- 직무별 sal 1000 이상 / 전체 커미션포함 평균연봉이 2000이상
SELECT job, count(*)
FROM emp
WHERE sal >= 1000
GROUP BY job
HAVING AVG((sal + ifnull(comm,0))) >= 2000;


-- 13_ 부서별 서로 다른 직무 수 ≥ 3
SELECT
	deptno,
	COUNT(DISTINCT job)
FROM emp
GROUP BY deptno
HAVING COUNT(DISTINCT job) >= 3;




-- 14) (참고) GROUP BY 없이 HAVING (전체 집계 필터)
SELECT AVG(sal)
FROM emp
HAVING AVG(sal) >= 1000;

-- 15) 부서별 급여 합 + 전체 총계
SELECT IF(GROUPING(deptno), 'all_sum',   deptno) AS dept_sum, 
		SUM(sal)
FROM emp
GROUP BY deptno WITH ROLLUP;

-- 16) 부서×직무 합계 + 부서 소계 + 전체 총계 (라벨링)
SELECT 
	IF(GROUPING(deptno), 'all_dept', deptno) AS dept,
    IF(GROUPING(job), 'sub_total', job) AS job,
	SUM(sal)
FROM emp
GROUP BY deptno, job WITH ROLLUP






-- 17) 모든 사원에 대하여 사원수, 급여총액, 평균급여, 최고급여, 최저급여 조회


-- 18) 모든 사원에 대하여 부서, 사원수, 급여총액, 평균급여, 최고급여, 최저급여를 부서별로 조회하고, 소수점 둘째자리 반올림


-- 19) 모든 사원에 대하여 부서, 업무, 사원수, 급여총액, 평균급여, 최고급여, 최저급여를 부서별, 직급별로 조회


-- 20) 급여(커미션포함) 평균이 2000이상인 부서번호, 부서별 사원수, 평균급여(커미션포함) 조회 


