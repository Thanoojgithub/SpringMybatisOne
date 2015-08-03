create table mydb.employee (eid BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), ename VARCHAR(30) NOT NULL);

insert into mydb.employee (ename) values ('sriram');

select * from mydb.employee;