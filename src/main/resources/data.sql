DROP TABLE Mobile_Feature;
DROP TABLE OPTION;
DROP TABLE QUESTION;
DROP TABLE PRODUCT;


CREATE TABLE PRODUCT (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    brand VARCHAR(255),
    model VARCHAR(255),
    type VARCHAR(255)  
);

CREATE TABLE Mobile_Feature (
    id INT AUTO_INCREMENT PRIMARY KEY,
    memory VARCHAR(255),
    colour VARCHAR(255),
    Description VARCHAR(255),
    product_id INT,
    foreign key (product_id) references PRODUCT(id)
);

CREATE TABLE QUESTION (
	id INT AUTO_INCREMENT PRIMARY KEY,
	question VARCHAR(255),
	description VARCHAR(255),
	product_id INT,
    foreign key (product_id) references PRODUCT(id) 
);

CREATE TABLE OPTION (
	id INT AUTO_INCREMENT PRIMARY KEY,
	value VARCHAR(255),
	is_Marked boolean,
	question_id INT,
    foreign key (question_id) references QUESTION(id) 
);

INSERT INTO PRODUCT VALUES(1,'Mobile','Apple','XR','Mobile');
INSERT INTO PRODUCT VALUES(2,'Mobile','Samsung','Galaxy','Mobile');

INSERT INTO MOBILE_FEATURE VALUES(1,'16GB','Black','Dual camera,dual sim',1);
INSERT INTO MOBILE_FEATURE VALUES(2,'32GB','Black','Dual camera,dual sim',1);
INSERT INTO MOBILE_FEATURE VALUES(3,'16GB','Black','Dual camera,dual sim',2);
INSERT INTO MOBILE_FEATURE VALUES(4,'32GB','Black','Dual camera,dual sim',2);

INSERT INTO QUESTION VALUES(1,'Which cell phone do you want to give back?',null,1);
INSERT INTO QUESTION VALUES(2,'What is the model of your Apple phone?',null,1);
INSERT INTO QUESTION VALUES(3,'Which is the internal memory of the phone?',null,1);
INSERT INTO QUESTION VALUES(4,'Are all the function properly working?',null,1);
INSERT INTO QUESTION VALUES(5,'Is the battery still ok?',null,1);
INSERT INTO QUESTION VALUES(6,'What is the optical condtion of your phone?',null,1);
INSERT INTO QUESTION VALUES(7,'Does the mobile phone have a SIM card lock (SIM/Net-Lock)',null,1);

INSERT INTO OPTION VALUES(1,'Apple',true,1);
INSERT INTO OPTION VALUES(2,'Samsung',false,1);
INSERT INTO OPTION VALUES(3,'Huawei',false,1);
INSERT INTO OPTION VALUES(4,'Sonstiges',false,1);
INSERT INTO OPTION VALUES(5,'16GB',true,3);
INSERT INTO OPTION VALUES(6,'32GB',false,3);
INSERT INTO OPTION VALUES(7,'64GB',false,3);
INSERT INTO OPTION VALUES(8,'128GB',false,3);
INSERT INTO OPTION VALUES(9,'yes',true,4);
INSERT INTO OPTION VALUES(10,'no',false,4);
INSERT INTO OPTION VALUES(11,'Yes, atleast 80% battery',true,5);
INSERT INTO OPTION VALUES(12,'No',false,5);
INSERT INTO OPTION VALUES(13,'I dont know',false,5);
INSERT INTO OPTION VALUES(14,'The battery is replaced',false,5);
INSERT INTO OPTION VALUES(15,'Very Good',true,6);
INSERT INTO OPTION VALUES(16,'Good',false,6);
INSERT INTO OPTION VALUES(17,'Ok',false,6);
INSERT INTO OPTION VALUES(18,'Bad',false,6);
INSERT INTO OPTION VALUES(19,'Yes',true,7);
INSERT INTO OPTION VALUES(20,'No',false,7);
INSERT INTO OPTION VALUES(21,'I dont know',false,7);

