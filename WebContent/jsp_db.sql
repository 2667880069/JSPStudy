USE jsp_db;
DROP TABLE if EXISTS tbl_user;
CREATE TABLE tbl_user(
id INT(11) UNSIGNED NOT NULL auto_increment,
name VARCHAR(50) NOT NULL DEFAULT '',
password VARCHAR(50) NOT NULL DEFAULT '',
email VARCHAR(50)  DEFAULT '',
PRIMARY KEY(id)
)
ENGINE=INNODB
DEFAULT charset=utf8;

DROP TABLE if EXISTS tbl_address;
CREATE TABLE tbl_address(
id INT(11) UNSIGNED NOT NULL auto_increment,
city VARCHAR(50) NOT NULL DEFAULT '',
country VARCHAR(50) NOT NULL DEFAULT '',
user_id INT(11) UNSIGNED NOT NULL,
PRIMARY KEY(id)
)
ENGINE=INNODB
DEFAULT charset=utf8;

INSERT INTO tbl_user VALUES(1,'刘伟','111111','liuwei@qq.com'),(2,'liu','111111','coffee@gmail.com');
INSERT INTO tbl_address(city,country,user_id) VALUES('jiansu','china',1),('nanjin','china',2);