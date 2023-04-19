show databases;
use backend_Development_mysql;
show tables;
desc student;
insert into student values 
(2,"Roy",800),
(5,"Saurabh",600),
(10,"Sumi",300),
(15, "Nema",400);
select * from student;
update student set mark=mark+50 where mark <500;
insert into student value(6,null,null);
delete from student where name is null;
select * from student;
delete from student where name="Ajeet" AND mark=600;
delete from student where name="Ajeet" or mark=600;
select * from student order by roll;
select name,mark from student where mark>=500 order by mark desc;
select * , mark+50 Grace from student;
select distinct roll from student;
select  * from student where mark != 500;
select * from student where mark IN(500,600,700);
select * from student where mark NOT IN(500,600,700);
select * from student where mark  between 500 and 800;
select * from student where mark Not between 200 and 700;
select * from student where name like 'a%';
select * from student where name like '%r';
select * from student where name like '%a%';
select * from student where name like '%__u%';
create table employee (
id int primary key,
name varchar(15) not null,
salary int not null
);
desc employee;
insert into employee values 
(1,"Ajeet",50000),
(3,"Roy",60000),
(5, "kumar", 40000);
insert into employee values(6,"Kumar",40000);
select * from employee;
/*composite key */ 
create table teacher (
name varchar(15),
subject varchar(10),
age int,
phone varchar(10),
email varchar(15),
primary key(name,subject)
);
desc teacher;
insert into teacher values 
("ajeet","java", 25,null,null),
("ajeet", "JS",25, null,null),
("rabi", "java", 30, null, null);
select * from teacher;
insert into teacher values 
("ajeet","java", 25,null,null);

/* Foreign key */

create table dept (
did int primary key,
dname varchar(15) not null,
location varchar(20)
);

create table emp (
eid int primary key,
ename varchar(15) not null,
salary int,
deptid int,
foreign key(deptid) references dept(did)
);
show tables;
drop table emp;
insert into dept values 
(10, "HR", "Bangalore"),
(15, "Account", "Patna"),
(12,"Sales","Delhi");

insert into emp values 
(1, "Aj", 40000,10),
(2, "jhj", 70000,15),
(5, "Ajsdb", 60000,10),
(6, "Adsfj", 80000,12),
(8, "Ajdfd", 50000,12),
(9, "Ajsdf", 30000,15);

select * from emp;
Select * from dept;

create table emp1 (
eid int primary key,
ename varchar(15) not null,
salary int,
deptid int,
foreign key(deptid) references dept(did) on update cascade
);

insert into emp1 values 
(1, "Aj", 40000,10),
(2, "jhj", 70000,15),
(5, "Ajsdb", 60000,10),
(6, "Adsfj", 80000,12),
(8, "Ajdfd", 50000,12),
(9, "Ajsdf", 30000,15);

select * from emp1;
drop table emp;
update dept set did=20 where did=10;

/* Adding constraint into exsting table */

create table a1 (id int, name varchar(15));
alter table a1 modify id int primary key;
alter table a1 add foreign key(id) references dept(did);
desc a1;
insert into a1 values(20,"aj");
select * from a1;
select sysdate() from dual;
select date_format(sysdate(), '%d %M %Y') from dual;


