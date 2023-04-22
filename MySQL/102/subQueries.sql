show databases;
use backend_development_mysql;
show tables;

/* Q.1 Write a query to display employee details who is working in HR department */

select * from emp1;
select * from dept;

select * from emp1 as e inner join dept as d on e.deptid=d.did where d.dname="HR";

/* Using suqueries */

select * from emp1 where deptid = (select did from dept where dname='HR'); 

/* Write a query to display employee details who is working with Aj */

select * from emp1 where deptid =(select deptid from emp1 where ename="Aj");

/* Write a query to display employee details who are getting more salary than
average salary of emp1 table */

select * from emp1 where salary> (select avg(salary) from emp1);

/* WAQ to display 2nd highest salaried employee details */

select * from emp1 where salary =( select max(salary) from emp1 where salary < (
select max(salary) from emp1));

select * from emp2;

/* WAQ to display details of employee who is working under 'Ram' */

select * from emp2 where mgr =(select eid from emp2 where ename='Ram');

/* Multiple rows and single column */
select * from emp1 where salary in (select salary from emp1 where eid>5);
select* from emp1;
insert into emp1 values (12,"Aj",60000,12);

select * from emp1 where eid in( select eid from emp1 where ename="Aj");

select * from emp1 where salary > any (select salary from emp1 where eid >1);
select * from emp1 where salary < all (select salary from emp1 where eid <1);

/* WAQ to display the employee who is getting max saalry in each department */

select * from emp1 where salary in (select max(salary) from emp1 group by deptid);

/* Multiple Columns sub queries*/

/* WAQ to display the employee details whose salary and deptid matches with salary
and deptid of "Aj" */
select * from emp1 where (salary, deptid) in ( select salary, deptid from emp1 where 
ename="Aj");

