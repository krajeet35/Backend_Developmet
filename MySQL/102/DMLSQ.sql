show databases;
use backend_development_mysql;
show tables;
create table x1(id int, name varchar(12));
 desc  x1;
select * from x1;
desc emp1;
desc dept;
select * from emp1;

select e.deptid,d.dname, e.ename, e.salary from dept d inner join emp1 e on
d.did=e.deptid and salary in (select  max(salary) from emp1 group by deptid);

/* DML Subqueries */

insert into x1 (select eid, ename from emp1);
select * from x1;
truncate table x1;

insert into x1 values (100, (select ename from emp1 where eid=10));
insert into x1 values (25, (select ename from emp1 where eid=10));
update x1 set name ="Ajeet" where id= (select eid from emp1 where ename="Roy");

delete from x1 where id= (select eid from emp1 where ename="Roy");

/* Auto Increment in MySQL */

show tables;
create table student2 
(
roll int primary key auto_increment,
name varchar(15),
marks int
);
desc student2;
insert into student2 (name, marks) values ("Ajeet",500);
select * from student2;
insert into student2 (name, marks) values ("Roy",600);
insert into student2 values (3,"Ajeet",500);
insert into student2 (name, marks) values ("Ram",500);
alter table student2 auto_increment=100;
insert into student2 (name, marks) values ("Shyam",500);

alter table x1 modify id int primary key auto_increment;
desc x1;

/* One to one relationship among tables */

show tables;
create table person1(
pid int primary key,
pname varchar(20),
mobile varchar(10)
);

create table dl(
did int primary key,
idate date,
edate date,
pid int unique,
foreign key(pid) references person1(pid)
);

/* One to many relationship 

emp1 table and dept table;
*/

/* Many to many relationship */
show tables;
desc student;
truncate student;
select  * from student;
desc course;
select * from course;
alter table student modify roll int primary key;
create table student_course (
roll int,
cid int,
foreign key(roll) references student(roll),
foreign key(cid) references course(cid)
);
desc student_course;

insert into student values
(2,"Ajeet",200),
(10,"ranjeet",400),
(5,"cky",500),
(6,"raju",100),
(8,"ay",600),
(12,"saurabh",500),
(22,"suman",300);

insert into student_course values
(2,5),
(2,20),
(22,10),
(12,30),
(2,5),
(12,10),
(2,30);

select s.name, c.cname from student s inner join course c inner join student_course sc
on s.roll=sc.roll and c.cid=sc.cid and c.cname="Java";