cp -p /Application/MAMP/Library/support-files/my-large.cnfApplication/MAMP/db/mysql/my.cnf

-- department tableの作成
create table department (
	departmentID int primary key AUTO_INCREMENT, 
	departmentName varchar(255)) engine=innodb;

-- department tableの作成
create table station (
	stationID int primary key AUTO_INCREMENT, 
	stationName varchar(255)) engine=innodb;

-- user tableの作成
CREATE TABLE user2 (userID int primary key AUTO_INCREMENT, 
	name varchar(255), 
	tell varchar(255), 
	age int, 
	birthday date, 
	departmentID int, 
	stationID int,
	foreign key(stationID) references station(stationID), 
	foreign key(departmentID) references department(departmentID)) engine=innodb;

-- department tableへの情報の挿入

insert into department values (1, '開発部');

insert into department values (2, '営業部');

insert into department values (3, '総務部');

-- department tableへの情報の挿入

insert into station values (1, '九段下');

insert into station values (2, '永田町');

insert into station values (3, '渋谷');

insert into station values (4, '神保町');

insert into station values (5, '上井坂');

-- user2 tableへの情報の挿入

insert into user2 (name, tell, age, birthday, departmentID, stationID) 
values ('田中 実', '012-345-6789', 30, '1994-02-01', 3, 1);

insert into user2 (name, tell, age, birthday, departmentID, stationID) 
values ('鈴木 茂', '090-1122-3344', 37, '1987-08-12', 3, 4);

insert into user2 (name, tell, age, birthday, departmentID, stationID) 
values ('鈴木 実', '080-5566-7788', 24, '2000-12-24', 2, 5);

insert into user2 (name, tell, age, birthday, departmentID, stationID) 
values ('佐藤 清', '012-0987-6543', 19, '2005-08-01', 1, 5);

insert into user2 (name, tell, age, birthday, departmentID, stationID) 
values ('高橋 清', '090-9900-1234', 24, '2000-12-24', 3, 5);

