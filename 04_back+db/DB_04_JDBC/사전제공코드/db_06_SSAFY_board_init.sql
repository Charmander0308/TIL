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

INSERT INTO board(title, writer, content) 
VALUES ("아직은 괜찮아-BackEnd01 Serlvet","양띵균","Servlet이란 ~~~~~"),
	   ("아직은 괜찮아-BackEnd02 JSP", "양띵균", "JSP란~~~");

SELECT * FROM board;