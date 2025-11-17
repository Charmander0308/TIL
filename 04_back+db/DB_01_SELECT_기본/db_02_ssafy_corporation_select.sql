USE SSAFY_CORPORATION;

-- 한 줄 주석
SELECT 
    *
FROM
    emp;



SELECT 
    deptno
FROM
    emp;


SELECT DISTINCT
    deptno
FROM
    emp;



SELECT 
    ename, deptno, job
FROM
    emp;


SELECT 
    ename 이름,
    empno '사번',
    sal * 12 AS '연봉',
    job AS '업 무'
FROM
    emp;


# Q5. 사원의 이름, 사번, 커미션, 급여, 커미션 포함 급여 조회
SELECT ename, empno, comm, sal, sal+comm "커미션 포함급여1", sal+ifnull(comm, 0) "커미션 포함급여2"
FROM emp;



# Q6. 모든 사원의 사번, 이름, 급여, 급여 등급  조회 (5000 이상 -> 높은연봉, 2000 이상 -> 평균 연봉, 그 외 -> 낮은연봉)
SELECT empno, ename, sal, 
		CASE WHEN sal >= 5000 THEN "높은연봉"
			 WHEN sal >= 2000 THEN "평균연봉"
             ELSE "낮은연봉"
		END "연봉 등급"
FROM emp;


# Q7. 부서 번호가 30인 사원중 급여가 1500 이상인 사원의 이름, 급여, 부서번호 조회
SELECT ename, sal, deptno
FROM emp
WHERE deptno = 30 AND sal >= 1500;




# Q8. 부서번호가 20 또는 30인 부서에서 근무하는 사원의 사번, 이름, 부서번호 조회
SELECT empno, ename, deptno
FROM emp
WHERE deptno = 30 OR deptno = 20;








# Q9. 부서번호가 20,30이 아닌 부서에서 근무하는 사원의 사번, 이름, 부서번호 조회
SELECT empno, ename, deptno
FROM emp
WHERE NOT (deptno = 30 OR deptno = 20);

SELECT empno, ename, deptno
FROM emp
WHERE deptno != 30 AND deptno <> 20;



# Q10. 업무가 'MANAGER', 'ANALYST', 'PRESIDENT' 인 사원의 이름, 사번, 업무조회
SELECT ename, empno, job
FROM emp
WHERE job IN ('MANAGER', 'ANALYST', 'PRESIDENT');


# Q11. 부서번호가 10, 20이 아닌 사원의 사번, 이름, 부서번호 조회
SELECT empno, ename, deptno
FROM emp
WHERE deptno NOT IN (10, 20);




# Q12. 급여가 2000이상 3000이하 인 사원의 사번, 이름, 급여조회
SELECT empno, ename, sal
FROM emp
WHERE sal BETWEEN 2000 AND 3000;



# Q13. 입사일이 1981년인 직원의 사번, 이름, 입사일 조회
SELECT empno, ename, hiredate
FROM emp
WHERE hiredate BETWEEN "1981-01-01" AND "1981-12-31";


# Q14. 커미션인 NULL 인 사원의 사번, 이름, 커미션 조회
SELECT empno, ename, comm
FROM emp
-- WHERE comm = NULL
WHERE comm IS NULL;






# Q15. 커미션 NULL이 아닌 사원의 사번, 이름, 업무, 커미션 조회
SELECT empno, ename, job,comm
FROM emp
WHERE comm IS NOT NULL;






# Q16. 이름이 M으로 시작하는 사원의 사번, 이름 조회
SELECT empno, ename
FROM emp
WHERE ename LIKE "M%";




# Q17. 이름에 E가 포함된 사원의 사번 이름 조회
SELECT empno, ename
FROM emp
WHERE ename LIKE "%E%";









# Q18. 이름의 세번째 알파벳이 'A'인 사원의 사번, 이름 조회
SELECT empno, ename
FROM emp
WHERE ename LIKE "__A%";



# Q19. 모든 직원의 모든 정보를 이름을 기준으로 내림차순 정렬
SELECT *
FROM emp
ORDER BY ename DESC;


# Q20. 모든 사원의 사번, 이름, 급여를 조회 (급여 내림차순)
SELECT empno, ename, sal
FROM emp
ORDER BY sal DESC;


# Q21. 20, 30번 부서에 근무하는 사원의 사번, 이름, 부서번호, 급여 조회 (부서별 오름차순, 급여순 내림차순)
SELECT empno, ename, deptno, sal
FROM emp
WHERE deptno IN (20, 30)
ORDER BY deptno, sal DESC;


