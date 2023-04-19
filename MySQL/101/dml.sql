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


