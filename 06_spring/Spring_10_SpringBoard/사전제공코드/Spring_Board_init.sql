DROP DATABASE IF EXISTS ssafy_board;
CREATE DATABASE ssafy_board DEFAULT CHARACTER SET utf8mb4;

USE ssafy_board;

CREATE TABLE board (
	id INT AUTO_INCREMENT,
    writer VARCHAR(20) NOT NULL,
    title VARCHAR(50) NOT NULL,
    content TEXT,
    view_cnt INT DEFAULT 0,
    reg_date TIMESTAMP DEFAULT now(),
    PRIMARY KEY(id)
);

CREATE TABLE `curriculum` (
	`code` INT NOT NULL PRIMARY KEY,
    `name` VARCHAR(40) NOT NULL
)ENGINE=InnoDB;


CREATE TABLE IF NOT EXISTS `users` (
  `id` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `name` varchar(40) NOT NULL,
  `curriculum_code` INT NOT NULL,
  CONSTRAINT `curriculum_fk` FOREIGN KEY (`curriculum_code`) REFERENCES `curriculum`(`code`),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

INSERT INTO board(title, writer, content) 
VALUES ("아직은 괜찮아1","양띵균","Spring Boot 아직은 괜찮아~~~"),
	   ("아직은 괜찮아2","양띵균","Vue.js 곧 배운다. 커밍쑨~~"),
       ("이제는 알아야해1", "양띵균", "");

INSERT INTO `curriculum` 
VALUES (100, 'Python'), (200, 'Java'), (300, 'Embedded'), (400, 'Mobile');

INSERT INTO users
VALUES ("ssafy", "1234", "김싸피", 200);


commit;

SELECT * FROM users;




SELECT u.id, u.password, u.name, c.name curriculumName
FROM users u , curriculum c
WHERE u.curriculum_code = c.code;








