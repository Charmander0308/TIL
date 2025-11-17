#Q1. 데이터베이스 생성해보자
CREATE DATABASE ssafy;

#Q2. ssafy 사용해보자
USE ssafy;

#Q3. 데이터베이스 목록을 조회해보자.
SHOW DATABASES;

#Q4. 문자집합을 설정해보자 -> 기존의 데이터베이스를 변경해서 
ALTER DATABASE ssafy
DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

#Q5. 데이터베이스를 삭제해보자
DROP DATABASE ssafy;

DROP DATABASE IF EXISTS ssafy;

#Q6. ssafy_user 테이블 작성해보자
CREATE TABLE ssafy_user (
	`user_num` INT AUTO_INCREMENT PRIMARY KEY,
    `user_id` VARCHAR(20) NOT NULL,
    `user_name` VARCHAR(30) NOT NULL,
    `user_password` VARCHAR(20) NOT NULL,
    `user_email` VARCHAR(30),
    `signup_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

DESCRIBE ssafy_user;
DESC ssafy_user;



#Q7. INSERT 구문 해보자
INSERT INTO ssafy_user -- (컬럼명)
VALUES (10, "godqhr", "양강사", "0000", "godqhr@ssafy.com", now());

INSERT INTO ssafy_user (user_id, user_name, user_password)
VALUES ("kimSSAFY", "kim", "1111");

INSERT INTO ssafy_user (user_id, user_name, user_password)
VALUES ("kimSSAFY", "kim", "1111"),
		("leeSSAFY", "kim", "1111"),
		("choiSSAFY", "kim", "1111");

SELECT * FROM ssafy_user;

#Q8. 데이터를 수정하자 : safe mode 가 동작한다!
UPDATE ssafy_user
SET user_name = "anoymuos";

UPDATE ssafy_user
SET user_password = "1234"
WHERE user_num = 20;


#Q9. 데이터를 삭제해보자
DELETE FROM ssafy_user
WHERE user_num = 1;

DELETE FROM ssafy_user;


#10. 트랜잭션을 경험해보자 -> MySQL AutoCommit 상태
SET autocommit = 0;

CREATE TABLE test_table(
	val VARCHAR(5)
);


START TRANSACTION; -- 해당 SQL을 실행한 이후의 모든 SQL은 하나의 작업단위로 본다.
INSERT INTO test_table VALUES("A");
INSERT INTO test_table VALUES("B");
INSERT INTO test_table VALUES("C");
INSERT INTO test_table VALUES("D");
INSERT INTO test_table VALUES("E");

ROLLBACK;

START TRANSACTION; -- 해당 SQL을 실행한 이후의 모든 SQL은 하나의 작업단위로 본다.
INSERT INTO test_table VALUES("S");
INSERT INTO test_table VALUES("S");
INSERT INTO test_table VALUES("A");
INSERT INTO test_table VALUES("F");
INSERT INTO test_table VALUES("Y");

COMMIT;

SELECT * FROM test_table;






























