show databases;
use backend_development_mysql;
show tables;
create table x1(id int, name varchar(12));
 desc  x1;
select * from x1;
desc emp1;
desc dept;

select e.deptid,d.dname, e.ename, e.salary from dept d inner join emp1 e on
d.did=e.deptid and salary in (select  max(salary) from emp1 group by deptid);

/* DML Subqueries */

insert into x1 (select eid, ename from emp1);
select * from x1;
truncate table x1;

insert into x1 values (100, (select ename from emp1 where eid=10));
