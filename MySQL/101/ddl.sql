show databases;
use backend_development_mysql;
show tables;
desc student;
drop table student;
show tables;
create table students
(roll int, name varchar(15), mark int);
desc students;
alter table students add column course varchar(10);
alter table students modify name varchar(20);
alter table students drop course;
alter table students rename student;
desc student;




