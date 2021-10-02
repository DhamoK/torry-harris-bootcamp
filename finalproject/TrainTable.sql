use finalproject;
SELECT * FROM finalproject.trains;
CREATE TABLE TRAINS ( TRAIN_NO numeric(5,0) PRIMARY KEY, TRAIN_NAME VARCHAR (40), SOURCE VARCHAR(20), DESTINATION VARCHAR (20), TICKET_PRICE numeric(8,2) ) ;
Insert into TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1001,'Shatabdi Express','Bangalore','Delhi',2500); 
Insert into TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1002,'Shatabdi Express','Delhi','Bangalore',2500); 
Insert into TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1003,'Udyan Express','Bangalore','Mumbai',1500); 
Insert into TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1004,'Udyan Express','Mumbai','Bangalore',1500); 
Insert into TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1005,'Brindavan Express','Bangalore','Chennai',1000); 
Insert into TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1006,'Brindavan Express','Chennai','Bangalore',1000); 