USE `ssafy_corporation`;
-- 7788번 사원의 부서이름을 조회하고 싶다.
select deptno
from emp
where empno = 7788;

select dname
from dept
where deptno = (select deptno
				from emp
				where empno = 7788);



-- 1. 매니저의 이름이 KING인 사원의 사번, 이름, 부서번호, 업무 
select empno
from emp
where ename = 'KING';

select empno, ename, deptno, job
from emp
where mgr = (select empno
			from emp
			where ename = 'KING');
             
-- 2. 7566번 사원보다 급여를 많이 받는 사원의 이름, 급여를 조회
select ename, sal
from emp
where sal > (select sal 
			from emp 
            where empno = 7566);
             
-- 3. 20번 부서의 평균 급여보다 급여가 많은 사원의 사번, 이름, 업무, 급여조회
select avg(sal)
from emp
where deptno = 20;

select empno, ename, job, sal
from emp
where sal > (select avg(sal)
			from emp
			where deptno = 20);

-- 4. 업무가 TURNER와 같고/ 사번 7934인 직원보다 급여/가 많은 사원의 사번, 이름, 업무를 조회
select job from emp where ename = 'TURNER';
select sal from emp where empno = 7934;

select empno, ename, job, sal
from emp
where job = (select job from emp where ename = 'TURNER')
and sal > (select sal from emp where empno = 7934);
			
# 다중 행            
-- 5. 업무가 SALESMAN 인 직원들 중 최소 한명 이상보다 많은 급여를 받는 사원의 이름, 급여, 업무를 조회하시오.
select sal
from emp
where job = "SALESMAN";
-- > ANY (최소값보다는 커야해) ||||||| < ANY (최대값보다는 작아야해)

select ename, sal, job
from emp
where sal > any (select sal
			from emp
			where job = "SALESMAN")
and job != "SALESMAN"
order by sal;

-- 6. 업무가 'SALESMAN'인 모든 직원보다 급여(커미션포함)를 많이 받는 사원의 이름, 급여, 업무, 입사일, 부서번호를 조회하시오.
# > ALL (최대값보다 큼) |||| < ALL (최대값보다는 작아야함)
select sal + ifnull(comm, 0) from emp where job = "SALESMAN";

select ename, sal, job, hiredate, deptno
from emp
where sal > ALL (select sal + ifnull(comm, 0) from emp where job = "SALESMAN");

-- 7. 직원이 최소 한명이라도 근무하는 부서의 부서번호, 부서이름, 위치
select distinct deptno
from emp;

select deptno, dname, loc
from dept
where deptno in (select distinct deptno
				from emp);


-- 8. 이름이 FORD인 사원과 매니저 및 부서가 같은 사원의 이름, 매니저번호, 부서번호를 조회 
select mgr, deptno from emp where ename = "FORD";

select ename, mgr, deptno
from emp
where (mgr, deptno) = (select mgr, deptno
						from emp
						where ename = "FORD")
and ename <> "FORD";

-- 9. 각 부서별 / 입사일이 가장 빠른 / 사원의 사번, 이름, 부서번호, 입사일을 조회
select ifnull(deptno, "대기발령"), min(hiredate) from emp group by deptno;

select empno, ename, deptno, hiredate
from emp
where (deptno, hiredate) in (select ifnull(deptno, "대기발령"), min(hiredate) from emp group by deptno);

-- 10. 소속 부서의 평균 급여보다 많은 급여를 받는 사원의 이름, 급여, 부서번호, 입사일, 업무를 조회

-- 11. 모든 사원의 평균급여보다 적게 받는 사원들과 같은 부서에서 근무하는 사원의 사번, 이름, 급여, 부서번호를 조회

-- 12. 모든 사원에 대하여 사원의 이름, 부서번호, 급여, 사원이 소속된 부서의 평균 급여를 조회 (단, 이름 오름차순)

-- 13. 사원의 이름, 부서번호, 급여, 소속부서의 평균 급여를 조회

-- 14. 부서번호가 10인 부서의 총 급여, 20인 부서의 평균 급여, 30인 부서의 최고, 최저 급여

-- 15. 모든사원의 번호, 이름, 부서번호, 입사일을 조회 (단, 부서이름기준으로 내림차순)