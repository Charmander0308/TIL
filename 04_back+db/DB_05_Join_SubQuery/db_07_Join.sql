USE `ssafy_corporation`;

# 1. 카티션 곱
SELECT * FROM emp;
SELECT * FROM dept;

# 조건을 명시하지 않으면 모든 원소들이 조인되어 결과가 나타남
SELECT empno, ename, job, emp.deptno, dept.deptno, dname
FROM emp, dept;

# 2. 7788번 사원의 정보를 보여주자 (부서 이름 포함)
SELECT empno, ename, job, emp.deptno, dname
FROM emp
INNER JOIN dept
ON emp.deptno = dept.deptno
WHERE empno = 7788;

SELECT empno, ename, job, e.deptno, dname
FROM emp e, dept d
WHERE e.deptno = d.deptno AND e.empno = 7788;

# USING
SELECT empno, ename, deptno, dname
FROM emp
INNER JOIN dept
USING (deptno)
WHERE empno = 7788;

#3. Outer JOIN
INSERT INTO emp
VALUES (7777, '안태리', 'MANAGER', 7839, '2025-10-10', 9999999, NULL, NULL);

# 이너조인
SELECT ename, emp.deptno, dname
FROM emp, dept
WHERE emp.deptno = dept.deptno;

# 한쪽기준을 주고 있는건 다보여줘 
SELECT ename, emp.deptno, dname
FROM emp
LEFT OUTER JOIN dept
ON emp.deptno = dept.deptno;

SELECT dept.deptno, dname, ename
FROM emp
RIGHT OUTER JOIN dept
ON emp.deptno = dept.deptno;

# 4. 셀프조인 (모든 사원의 사번, 매니저 사번, 이름)
SELECT e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno;

# King 없다...
 SELECT e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
FROM emp e1
LEFT OUTER JOIN emp e2
ON e1.mgr = e2.empno;

# 비동등조인
-- 사원들의 급여 등급을 보고싶다
SELECT e.empno, e.ename, e.sal, sg.grade
FROM emp e, salgrade sg
WHERE e.sal BETWEEN sg.LOSAL AND sg.HISAL
ORDER BY sg.grade DESC, e.sal DESC;



