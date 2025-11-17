USE SSAFY_CORPORATION;

# LIMIT : 개수를 제한하여 보여주고 싶을 때 ORDER BY 함께 사용하면 상위, 하위
select *
from emp
ORDER BY sal DESC
LIMIT 5;

select *
from emp
ORDER BY sal DESC
LIMIT 5, 5;	-- 5명 제끼고 그 다음 5명

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
SELECT SUM(sal), SUM(comm), ROUND(AVG(sal)), AVG(comm)
from emp;

-- 3) '커미션을 0으로 간주한' 평균
--    - IFNULL/COALESCE로 NULL을 0으로 치환해서 평균에 반영
select 
	round(avg(sal+ifnull(comm, 0)),2) as ifnull_avg,	-- mysql 표준
	round(avg(sal+coalesce(comm, 0)),2) as ifnull_avg	-- sql 표준
from emp;

-- 4) MIN/MAX 기본 사용
select
	min(sal), max(sal)
from emp;

-- 5) DISTINCT와 함께: 서로 다른 직무 수
select count(*), count(distinct job)
from emp;

-- 6) 한 번에 여러 지표 요약해서 레포트처럼 보기
select
	count(*) as emp_cnt,
    count(distinct job) as jobs_cnt,
    sum(sal) as total_sal,
    round(avg(sal), 2) as avg_sal,
    min(sal),
    max(sal),
    round(avg(sal+ifnull(comm, 0)),2) as ifnull_avg
from emp;

-- 7) 부서별 급여 요약 (DEPTNO 기준)
select 
	deptno,
    -- ename, -- 이건 추가하면 출력 기준이 애매해져서 출력이 안됨
	count(*) as emp_cnt,
    sum(sal),	-- 부서별 합이 나옴
    max(sal)	-- 부서에서 가장 높은 값이 나옴
from emp
group by deptno;

-- 8) 직무별 인원/평균 급여
select
	job, 
    count(*) as N,
    round(avg(sal), 2) as avg_sal
from emp
group by job;


-- 9) 입사 연도별 인원수
select 
	year(hiredate) as hire_year, count(*)
from emp
group by year(hiredate)
order by hire_year; 


-- 10) WHERE로 전처리 후 GROUP BY (성능/의미상 권장)
--     예) 1981년 입사자만 대상으로 부서별 인원
select 
	deptno, count(*)
from emp
where year(hiredate) = 1981
group by deptno;


-- 11) 부서별 평균급여 ≥ 2000 AND 인원 ≥ 3
select deptno, count(*), avg(sal)
from emp
group by deptno
having avg(sal) >= 2000 and count(*) >= 3;


-- 12) WHERE + HAVING 함께 쓰기 (역할 분리)
--      WHERE: 그룹 전 필터 / HAVING: 그룹 후 집계조건 필터
-- 직무별 sal 1000 이상/ 전체 커미션포함 평균연봉이 2000이상
select
	job, count(*)
from emp
where sal >= 1000
group by job
having avg((sal + ifnull(comm,0))) >= 2000;

-- 13_ 부서별 서로 다른 직무 수 ≥ 3
select 
	deptno,
	count(distinct job)
from emp
group by deptno
having count(distinct job) >= 3;


-- 14) (참고) GROUP BY 없이 HAVING (전체 집계 필터)
select avg(sal)
from emp
having avg(sal) >= 1000;


-- 15) 부서별 급여 합 + 전체 총계
select 
	if(grouping(deptno), 'all_sum', deptno) as dept_sum,
    sum(sal)
from emp
GROUP BY deptno with rollup;


-- 16) 부서×직무 합계 + 부서 소계 + 전체 총계 (라벨링)
select
	if(grouping(deptno), 'all_dept', deptno) as dept,
    if(grouping(job), 'sub_total', job) as job,
	sum(sal)
from emp
group by deptno, job with rollup


-- 17) 모든 사원에 대하여 사원수, 급여총액, 평균급여, 최고급여, 최저급여 조회


-- 18) 모든 사원에 대하여 부서, 사원수, 급여총액, 평균급여, 최고급여, 최저급여를 부서별로 조회하고, 소수점 둘째자리 반올림


-- 19) 모든 사원에 대하여 부서, 업무, 사원수, 급여총액, 평균급여, 최고급여, 최저급여를 부서별, 직급별로 조회


-- 20) 급여(커미션포함) 평균이 2000이상인 부서번호, 부서별 사원수, 평균급여(커미션포함) 조회 


