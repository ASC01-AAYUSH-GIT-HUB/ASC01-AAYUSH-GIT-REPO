CREATE DATABASE FRIENDS;
USE FRIENDS;
CREATE TABLE MYFRIENDS(
    ID VARCHAR(10) PRIMARY KEY,
    firstname VARCHAR(100) NOT NULL,
    lastname VARCHAR(100),
    age INT,
    phone VARCHAR(15),
    email VARCHAR(100)
);


CREATE TRIGGER INSERT_FRIENDS
ON MYFRIENDS
INSTEAD OF INSERT
AS
BEGIN
    DECLARE @maxId VARCHAR(10);
    DECLARE @NextID int;
    DECLARE @FIRSTNAME VARCHAR(100);
    DECLARE @LASTNAME VARCHAR(100);
    DECLARE @AGE INT;
    DECLARE @PHONE VARCHAR(100);
    DECLARE @EMAIL VARCHAR(100);

    SELECT @FIRSTNAME=firstname,@LASTNAME=lastname,@AGE=age,@PHONE=phone,@EMAIL=email FROM inserted;

    
    SET @NextID = NEXT VALUE FOR FriendSeq;
    SET @maxId = 'F' + RIGHT('000' + CAST(@NextID AS VARCHAR), 3);

    INSERT INTO MYFRIENDS (ID,firstname,lastname,age,phone,email)
    VALUES (@maxId,@FIRSTNAME,@LASTNAME,@AGE,@PHONE,@EMAIL );
END;

CREATE SEQUENCE FriendSeq
    START WITH 1
    INCREMENT BY 1;


insert into MYFRIENDS(firstname,lastname,age,phone,email) values('gandu','sing',34,'14241','nces@mail.com');

SELECT * FROM myfriends;