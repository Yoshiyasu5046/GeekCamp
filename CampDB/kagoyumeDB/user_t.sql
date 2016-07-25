cp -p /Application/MAMP/Library/support-files/my-large.cnfApplication/MAMP/db/mysql/my.cnf

create table user_t (
	userID int primary key AUTO_INCREMENT, 
	name varchar(255), 
	password varchar(255), 
	mail varchar(255),
	address text, 
	total int, 
	newDate Datetime,
	deleteFlg int
) engine=innodb;


create table buy_t (
	buyID int primary key AUTO_INCREMENT, 
	userID int,  
	itemCode varchar(255),
	type int,  
	buyDate Datetime,
	foreign key(userID) references user_t(userID)
) engine=innodb;