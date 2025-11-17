USE SSAFY_CORPORATION;

-- 한 줄 주석
# 한 줄 주석
/*
	여러 줄 주석
*/

# Q1. 모든 사원 모든 정보 검색
select * 
from emp;

# Q2-1. 사원이 근무하는 부서 번호
select deptno 
from emp;

# Q2-2. 사원이 근무하는 부서 번호(중복제거)
select distinct deptno
from emp;

# Q3. 사원의 이름, 부서번호, 업무 조회
select ename, deptno, job
from emp;

# Q4. 사원의 이름, 사번, 급여*12 (연봉), 업무 조회
select ename 이름, empno "사번", sal*12 AS "연봉", job "업 무"
from emp;
-- ctrl + b 하면 자동으로 줄맞춤됨

# Q5. 사원의 이름, 사번, 커미션, 급여, 커미션 포함 급여 조회
select ename, empno, comm, sal, comm + sal "커미션 포함급여1", sal+ifnull(comm, 0) "커미션 포함급여2"
from emp;

# Q6. 모든 사원의 사번, 이름, 급여, 급여 등급  조회 (5000 이상 -> 높은연봉, 2000 이상 -> 평균 연봉, 그 외 -> 낮은연봉)
select empno, ename, sal,
		case when sal >= 5000 then "높은연봉"
			 when sal >= 2000 then "평균연봉"
		     else "낮은연봉"
		end "연봉등급"
from emp;

# Q7. 부서 번호가 30인 사원중 급여가 1500 이상인 사원의 이름, 급여, 부서번호 조회
select ename, sal, deptno
from emp
where deptno >= 30 and sal >= 1500;

# Q8. 부서번호가 20 또는 30인 부서에서 근무하는 사원의 사번, 이름, 부서번호 조회
select empno, ename, deptno
from emp
where deptno = 30 or deptno = 20;

# Q9. 부서번호가 20,30이 아닌 부서에서 근무하는 사원의 사번, 이름, 부서번호 조회
select empno, ename, deptno
from emp
where not (deptno = 30 or deptno = 20);

select empno, ename, deptno
from emp
where deptno != 30 and deptno != 20;

select empno, ename, deptno
from emp
where deptno != 30 and deptno <> 20;	-- 이게 표준....

# Q10. 업무가 'MANAGER', 'ANALYST', 'PRESIDENT' 인 사원의 이름, 사번, 업무조회
select ename, empno, job
from emp
where job in('MANAGER', 'ANALYST', 'PRESIDENT');

# Q11. 부서번호가 10, 20이 아닌 사원의 사번, 이름, 부서번호 조회
select empno, ename, deptno
from emp
where deptno not in (10, 20);

# Q12. 급여가 2000이상 3000이하 인 사원의 사번, 이름, 급여조회
select empno, ename, sal
from emp
where sal between 2000 and 3000;

# Q13. 입사일이 1981년인 직원의 사번, 이름, 입사일 조회
select empno, ename, hiredate
from emp
where hiredate between "1981-01-01" and "1981-12-31";

# Q14. 커미션인 NULL 인 사원의 사번, 이름, 커미션 조회
select empno, ename, comm
from emp
-- where comm = null;
where comm is null;

# Q15. 커미션 NULL이 아닌 사원의 사번, 이름, 업무, 커미션 조회
select empno, ename, job, comm
from emp
where comm is not null;

# Q16. 이름이 M으로 시작하는 사원의 사번, 이름 조회
select empno, ename
from emp
where ename like "M%";

# Q17. 이름에 E가 포함된 사원의 사번 이름 조회
select empno, ename
from emp
where ename like "%M%";

# Q18. 이름의 세번째 알파벳이 'A'인 사원의 사번, 이름 조회
select empno, ename
from emp
where ename like "__A%";

# Q19. 모든 직원의 모든 정보를 이름을 기준으로 내림차순 정렬
select *
from emp
order by ename desc;

# Q20. 모든 사원의 사번, 이름, 급여를 조회 (급여 내림차순)
select empno, ename, sal
from emp
order by sal desc;

# Q21. 20, 30번 부서에 근무하는 사원의 사번, 이름, 부서번호, 급여 조회 (부서별 오름차순, 급여순 내림차순)
select empno, ename, deptno, sal
from emp
where deptno = 20 or deptno = 30
order by deptno, sal desc;

select empno, ename, deptno, sal
from emp
where deptno in (20, 30)
order by deptno, sal desc;


