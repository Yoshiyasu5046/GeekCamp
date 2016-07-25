cp -p /Application/MAMP/Library/support-files/my-large.cnf/Application/MAMP/db/mysql/my.cnf

-- 巨大ソースのDB　作成

CREATE TABLE user_t (
	userID int primary key AUTO_INCREMENT, 
	name varchar(255), 
	birthday date,
	tell varchar(255), 
	type int,  
	comment text, 
	newDate Datetime
);