create table mydb.employee (eid BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), ename VARCHAR(30) NOT NULL);

insert into mydb.employee (ename) values ('sriram');

select * from mydb.employee;


CALL getEmployee (6)

DELIMITER $$
CREATE PROCEDURE getEmployee (IN eid BIGINT)
BEGIN
    SELECT * FROM mydb.employee u WHERE u.eid = eid;
END $$

DROP PROCEDURE getEmployee;