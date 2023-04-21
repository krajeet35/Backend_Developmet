show databases;
use backend_development_mysql;
show tables;

/* Q.1 Write a query to display employee details who is working in HR department */

select * from emp1;
select * from dept;

select * from emp1 as e inner join dept as d on e.deptid=d.did where d.dname="HR";

/* Using suqueries */

select * from emp1 where deptid = (select did from dept where dname='HR'); 