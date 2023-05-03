show databases;
create database student_registration_system;
use student_registration_system;
show tables;
create table admin(
adminId int primary key auto_increment,
adminName varchar(20),
adminEmail varchar(20) unique,
adminPassword varchar(20)
);
insert into admin values(1,"Ajeet kumar","ajeet@1234","1234");
select * from admin;
create table student(
roll int primary key auto_increment,
sname varchar(20),
semail varchar(20) unique,
spassword varchar(12)
);

create table course(
cid int primary key auto_increment,
cname varchar(20),
fee int,
duration varchar(15),
totalSeat int
);

create table batch(
batchId int primary key auto_increment,
cid int,
batchSeat int,
foreign key(cid) references course(cid)
);

create table student_batch(
roll int,
batchid int,
foreign key(roll) references student(roll),
foreign key(batchid) references batch(batchId)
);

create table student_course(
roll int,
cid int,
foreign key(roll) references student(roll),
foreign key(cid) references course(cid)
);

show tables;
select * from student;
select * from student_batch;
select * from course;
select * from batch;
select * from student_course;