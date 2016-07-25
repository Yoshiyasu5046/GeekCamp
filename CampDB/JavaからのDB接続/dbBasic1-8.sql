cp -p /Application/MAMP/Library/support-files/my-large.cnf/Application/MAMP/db/mysql/my.cnf


-- データベース基礎　課題1-8

-- path $ mysql -u root -p

-- 課題1　テーブルの作成とデータ入力

CREATE TABLE profiles (profilesID integer, name text, tell text, age integer, birthday text);

insert into profiles values (1, '田中 実', '012-345-6789', 30, '1994-02-01');

insert into profiles values (2, '鈴木 茂', '090-1122-3344', 37, '1987-08-12');

insert into profiles values (3, '鈴木 実', '080-5566-7788', 24, '2000-12-24');

insert into profiles values (4, '佐藤 清', '012-0987-6543', 19, '2005-08-01');

insert into profiles values (5, '高橋 清', '090-9900-1234', 24, '2000-12-24');

-- 課題2
select * from profiles where profilesID=3;

-- 課題3
select * from profiles where name = '高橋 清';

-- 課題4
select * from profiles where age = 24;

-- 課題5
select * from profiles where age >= 25;

-- 課題6
select * from profiles where name like '%実%';

-- 課題7
update profiles set name = '吉田 茂' where profilesID = 2;
select * from profiles where profilesID = 2;

-- 課題8
delete from profiles where birthday = '2000-12-24';


