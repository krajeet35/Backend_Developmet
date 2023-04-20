show databases;
use backend_development_mysql;
show tables;
select * from dept;
select * from emp1;
/* Cross join */

select * from emp1, dept;

/* Inner join */
select * from dept as d inner join emp1 as e on d.did=e.deptid;
select * from emp1 as e inner join dept as d on d.did=e.deptid where dname="HR"
order by e.salary desc;

/* Left join */
desc emp1;
insert into emp1 values (25,"Roy",30000,null);
select * from emp1 as e left join dept as d on d.did = e.deptid;

/* Right join */
select * from dept as d right join emp1 as e on d.did = e.deptid;

/* Full outer join */
select * from emp1 as e left join dept as d on d.did = e.deptid
union
select * from emp1 as e right join dept as d on d.did = e.deptid;

select dname from dept union select ename from emp1;

/* Self join */

create table emp2 (
eid int primary key,
ename varchar(15),
salary int,
mgr int
);

insert into emp2 values
(2, "Ram",600000,null),
(20, "Ravi",60000,2),
(3, "Amit",60000,2),
(5, "Siya",70000,20),
(6, "Pushpa",80000,3),
(8, "Sujoy",20000,5),
(10, "Sanjay",60000,6);

select * from emp2;

select n.ename as employee, o.ename as Manager from emp2 as o , emp2 as n
where o.eid=n.mgr order by o.eid;

show tables;
desc teacher;
desc student;
desc emp1;
desc dept;

create table course(
cid int primary key,
cname varchar(20),
fee int
);

create table teacher1(
tid int primary key,
tname varchar(15),
cid int,
foreign key(cid) references course(cid)
);

create table student1 (
roll int primary key,
sname varchar(15),
cid int,
foreign key(cid) references course(cid)
);

show tables;
desc course;
desc teacher1;
desc student1;