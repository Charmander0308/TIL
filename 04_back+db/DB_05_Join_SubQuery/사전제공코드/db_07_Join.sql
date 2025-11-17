USE `ssafy_corporation`;

# 1. 카티션 곱
select * from emp;
select * from dept;
# 오류 발생!
select empno, ename, job, deptno, dname
from emp, dept;
# 조건을 명시하지 않으면 모든 원소들이 조인되어 결과가 나타남
select empno, ename, job, emp.deptno, dept.deptno, dname
from emp, dept;

# 2. 7788번 사원의 정보를 보여주자(부서 이름 포함)
# 이슈 발생
select empno, ename, job, emp.deptno, dname
from emp;

select empno, ename, job, emp.deptno, dname
from emp
inner join dept
on emp.deptno = dept.deptno   -- 이거 없으면 카티션 곱이 출력됨
where empno = 7788;

select empno, ename, job, emp.deptno, dname
from emp, dept
where emp.deptno = dept.deptno and empno = 7788;
# 알리아스 사용 가능
select empno, ename, job, e.deptno, dname
from emp e, dept d
where e.deptno = d.deptno and e.empno = 7788;
# USING
select empno, ename, deptno, dname
from emp
inner join dept
using (deptno)
where empno = 7788;

# 3. Outer JOIN
insert into emp
values (7777, '안태리', 'MANAGER', 7839, '2025-10-10', 5000, NULL, NULL);

# 이너조인
select ename, emp.deptno, dname
from emp, dept
where emp.deptno = dept.deptno;	-- 태리는 부서번호가 없어서 출력되지 않는 이슈 발생!

# 한쪽 기준을 주고 있는건 다 보여줘
select ename, emp.deptno, dname
from emp
left outer join dept
on emp.deptno = dept.deptno;

select dept.deptno, dname, ename
from emp
right outer join dept
on emp.deptno = dept.deptno;

# 4. 셀프조인 (모든 사원의 사번, 매니저 사번, 이름)
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;
-- king 없다... 사수가 null이라서...
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1 left outer join emp e2
on e1.mgr = e2.empno;
-- right로 해보면 어떻게 나오나?
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1 right outer join emp e2
on e1.mgr = e2.empno;

# 비동등조인
-- 사원들의 급여 등급을 보고싶다
select e.empno, e.ename, e.sal, sg.grade
from emp e, salgrade sg
where e.sal between sg.losal and sg.hisal
order by sg.grade desc, e.sal desc;