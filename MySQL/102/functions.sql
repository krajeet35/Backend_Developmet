show databases;
use backend_development_mysql;
show tables;

/* Functions */
/* Numeric Functions */
select abs(-10);
select mod(9,2);
select round(1.1264,3);
select truncate(1.1264,3);
select ceil(2.56);
select floor(2.56);
select greatest(1,5,3,6,8,7,9);
select least(1,5,3,6,8,7,9);
/* Character Functions */
select upper(name) from student;
select lower(name) from student;
select name, length(name) from student;
select substr("saurabh",2,4);

/* Date Functions */
select sysdate();
select date_format( sysdate(), '%d %M %Y');
select adddate(sysdate(), interval 3 day);

/* Group Functions  or Aggregate functions*/
select * from student;
select max(mark) from student;
select min(mark) from student;
select  avg(mark) from student;
select sum(mark) from student;
select count(mark) from student;
select count(*) from student;
select * from student group by mark;
select * from emp1 where salary>=30000
 group by eid having deptid =20 
 order by salary desc;
 select deptid, min(salary), max(salary), avg(salary) from emp1 group by deptid;
 select * from dept;
 select * from emp1;
 select * from dept,emp1;