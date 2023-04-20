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





