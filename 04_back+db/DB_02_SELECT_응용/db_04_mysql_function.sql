-- ============================================================
-- 1) Numeric Functions (수치 함수)
-- ============================================================
-- 기본 연산/절삭/반올림/최댓값·최솟값
SELECT
	abs(-42) AS abs,
	ceil(3.14) AS 올림,
    floor(3.14) AS 내림,
    ROUND(3.14159, 2) AS "2자리수까지 표현",
	POW(2, 5) AS "2**5",
    MOD(17, 5) AS "mod",
    greatest(10, 20, 5) AS max;

-- FROM dual






-- ============================================================
-- 2) String Functions (문자열 함수)
-- ============================================================
-- 대소문자/길이/부분 문자열/검색/치환/패딩/트림/뒤집기
SELECT 
	ename,
	upper(ename),
    lower(ename),
    length(ename),
    char_length(ename),
    substring(ename, 1, 3),
    left(ename, 2),
    right(ename, 2),
    replace(ename, 'A', '*')
FROM emp
LIMIT 5;

-- 공백/문자 패딩 & 트림, 연결
SELECT 
	concat("Hello. ",ename),
    lpad(ename, 10, '*'),
    rpad(ename, 10, '*'),
    trim('           ssafy      '), -- ltrim(), rtirm(),
    reverse(ename)
FROM emp;



-- 멀티바이트 길이 차이(참고)
SELECT
	length('가'),
	char_length('가'),
    length('😊'),
    char_length('😊');




-- ============================================================
-- 3) Date / Time Functions (날짜·시간 함수)
-- ============================================================
-- 현재 시각/날짜 파생/형식화
SELECT
  CURDATE()                                AS curdate_,
  NOW()                                    AS now_,
  DATE(NOW())                              AS date_part,
  TIME(NOW())                              AS time_part,
  YEAR(CURDATE())                          AS yyyy,
  MONTH(CURDATE())                         AS mm,
  DAY(CURDATE())                           AS dd,
  DATE_FORMAT(CURDATE(), '%Y-%m-%d (%a)')  AS formatted;

-- 입사일 파생 컬럼
SELECT
  ENAME, HIREDATE,
  YEAR(HIREDATE)                            AS hire_year,
  MONTH(HIREDATE)                           AS hire_month,
  DATE_FORMAT(HIREDATE, '%Y-%m')            AS hire_ym
FROM EMP
ORDER BY HIREDATE
LIMIT 8;

-- 날짜 가감/차이
SELECT
  DATE_ADD(CURDATE(), INTERVAL 10 DAY)        AS plus_10d,
  DATE_SUB(CURDATE(), INTERVAL 2 MONTH)       AS minus_2m,
  DATEDIFF(CURDATE(), '1981-01-01')           AS days_since_1981,
  TIMESTAMPDIFF(MONTH, '1981-01-01', CURDATE()) AS months_since_1981;

-- 문자열 → 날짜 파싱 & 다시 포맷
SELECT
  STR_TO_DATE('09/30/2025 14:35', '%m/%d/%Y %H:%i')    AS parsed_dt,
  DATE_FORMAT(STR_TO_DATE('09/30/2025','%m/%d/%Y'), '%Y-%m-%d') AS normalized_date;

-- 직원별 근속(연/월/일 단위) 예시
SELECT
  ENAME, HIREDATE,
  TIMESTAMPDIFF(YEAR,  HIREDATE, CURDATE())  AS yrs,
  TIMESTAMPDIFF(MONTH, HIREDATE, CURDATE())  AS months,
  TIMESTAMPDIFF(DAY,   HIREDATE, CURDATE())  AS days
FROM EMP
ORDER BY yrs DESC
LIMIT 8;

-- ============================================================
-- 4) NULL & Conditional (NULL 처리 / 조건 함수)
-- ============================================================
-- NULL 처리: IFNULL, COALESCE, NULLIF
SELECT
  ENAME, SAL, COMM,
  IFNULL(COMM, 0)                           AS comm0_ifnull,
  COALESCE(COMM, 0)                         AS comm0_coalesce,
  NULLIF(JOB, 'MANAGER')                    AS null_if_manager   -- 같으면 NULL, 다르면 JOB
FROM EMP
ORDER BY ENAME
LIMIT 8;

-- 조건식: IF / CASE WHEN
SELECT
  ENAME, SAL,
  IF(SAL >= 3000, 'HIGH', 'NORMAL')        AS flag_if,
  CASE
    WHEN SAL >= 3000 THEN 'A'
    WHEN SAL >= 2000 THEN 'B'
    ELSE 'C'
  END                                      AS grade_case
FROM EMP
ORDER BY SAL DESC
LIMIT 8;

-- 조건부 합계(그룹 없이 전체 기준)
SELECT
  SUM(IF(COMM IS NULL, 1, 0))  AS null_comm_cnt,
  SUM(IF(COMM IS NOT NULL, 1, 0)) AS notnull_comm_cnt
FROM EMP;

-- ============================================================
-- 5) Casting / Conversion (형변환)
-- ============================================================
SELECT
  CAST('123' AS UNSIGNED)                     AS cast_num,
  CAST(123.45 AS SIGNED)                      AS cast_sign,
  CAST('2025-09-30' AS DATE)                  AS cast_date,
  CONVERT('abc' USING utf8mb4)                AS conv_charset;

-- 숫자 ↔ 문자열
SELECT
  ENAME,
  CONCAT('급여=', CAST(SAL AS CHAR))          AS sal_as_text,
  CAST('9876' AS UNSIGNED) + 24               AS str_plus_num
FROM EMP
LIMIT 5;



