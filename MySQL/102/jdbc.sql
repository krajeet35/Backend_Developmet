show databases;
use backend_development_mysql;
show tables;

use jdbc1;
show tables;
select * from student;
desc student;

create table emp ( id int primary key, name varchar(15), dept int);

create database sample1;
use sample1;
show tables;
create table student(
roll int primary key auto_increment,
name varchar(20),
email varchar(20),
password varchar(15)

);

create table course (
cid int primary key auto_increment,
cname varchar(20),
fee int,
duration varchar(15)
);

create table student_course (
cid int, 
roll int,
foreign key(cid) references course(cid),
foreign key(roll) references student(roll)
);

alter table student modify email varchar(15) unique;
select * from student;
truncate table student;
