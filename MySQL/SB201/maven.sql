show databases;
create database sb201;
use sb201;
show tables;
create table student (
roll int primary key,
name varchar(15),
marks int
);
insert into student values
(1,"Ajeet",500),
(10,"Ranjeet",400),
(12,"Ayush",700),
(15,"Kundan",600);
select * from student;
select * from product;
select * from mystudent;
select * from hibernate_sequence;
drop table student;

select * from account;
update account set name="Ajeet" where acc=4;

select * from employee;
select * from employee2;
show tables;
select * from employee3;
select * from employee3_add;
select * from emp3_add;
