show databases;
create database rest1;
use rest1;
show tables;
select * from student;
select * from student_seq;
desc student;
insert into student values (16,640,"Shyam");
create database rest2;
use rest2;
show tables;
select * from course;
select * from course_seq;
select * from student;
select * from student_seq;
select * from student_courses;
drop database rest2;