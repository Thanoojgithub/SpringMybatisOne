create table mydb.employee (eid BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), ename VARCHAR(30) NOT NULL);

insert into mydb.employee (ename) values ('sriram');

select * from mydb.employee;


DELETE from mydb.employee where eName='krishna';

CALL findUserById (6)



DELIMITER $$

CREATE PROCEDURE findUserById (IN user_id BIGINT)
BEGIN
    SELECT * FROM mydb.user u WHERE u.user_id = user_id;
END $$

DROP PROCEDURE findUserById;



CALL getEmployeeByName ("seeta")

DELIMITER $$
CREATE PROCEDURE getEmployeeByName (IN eName VARCHAR(30))
BEGIN
    SELECT * FROM mydb.employee e WHERE e.eName = eName;
END $$

DROP PROCEDURE getEmployee;


CALL getEmployees ()

DELIMITER $$
CREATE PROCEDURE getEmployees ()
BEGIN
    SELECT * FROM mydb.employee e;
END $$

DROP PROCEDURE getEmployees;