-- ============================================================
-- 1) Numeric Functions (수치 함수)
-- ============================================================
-- 기본 연산/절삭/반올림/최댓값·최솟값
select
	abs(-42) as abs,
    ceil(3.14) as 올림,
    floor(3.14) as 내림,
    round(3.14159, 2) as "2자리수까지 표현",
    pow(2, 5) as "2**5",
    mod(17, 5) as "mod",
    greatest(10, 20, 5) as max;
-- from dual 이 들어가 있는 상태!(안적어도 자동임)



-- ============================================================
-- 2) String Functions (문자열 함수)
-- ============================================================
-- 대소문자/길이/부분 문자열/검색/치환/패딩/트림/뒤집기
select 
	ename,
    upper(ename),
    lower(ename),
    length(ename),
    char_length(ename),
    substring(ename, 1, 3),
    left(ename, 2),
    right(ename, 2),
    replace(ename, 'A', '*')
from emp
limit 5;


-- 공백/문자 패딩 & 트림, 연결
select
	concat("Hello. ", ename),
    lpad(ename, 10, '*'),
    rpad(ename, 10, '*'),
    trim('     ssafy     '), -- ltrim(), rtrim() : 좌/우 공백 제거
    reverse(ename)
from emp;


-- 멀티바이트 길이 차이(참고)
select
	length('가'),	-- 한글은 3바이트
    char_length('가'),
    length('😢'),	-- 이모지는 4바이트
    char_length('😢');

-- ============================================================
-- 3) Date / Time Functions (날짜·시간 함수)
-- ============================================================
-- 현재 시각/날짜 파생/형식화
select
	curdate(),
    now(),
    date(now()),
    time(now()),
    year(curdate()),
    month(curdate()),
    day(curdate()),
    yearweek(curdate()),
    date_format(curdate(), '%Y-%m-%d (%a)'); -- (y,m,d) 는 대소문자마다 다름!!
    

-- 입사일 파생 컬럼


-- 날짜 가감/차이
select
	date_add(curdate(), interval 10 day),
	date_add(curdate(), interval 2 month),
	datediff(curdate(), '2025-07-08');


-- 문자열 → 날짜 파싱 & 다시 포맷


-- 직원별 근속(연/월/일 단위) 예시


-- ============================================================
-- 4) NULL & Conditional (NULL 처리 / 조건 함수)
-- ============================================================
-- NULL 처리: IFNULL, COALESCE, NULLIF


-- 조건식: IF / CASE WHEN
select
	ename, sal, 
    if(sal >= 3000, 'HIGH', 'NORMAL'),
    case
		when sal >= 3000 then '고액연봉'
        when sal >= 2000 then '평균연봉'
        else '낮은연봉'
	end
from emp;


-- 조건부 합계(그룹 없이 전체 기준)
select
	sum(if(comm is null, 1, 0)) -- 사실 count 쓰면 됨 ㅎㅎ
from emp;

