
DROP DATABASE IF EXISTS holiday_camp_db;
CREATE DATABASE holiday_camp_db;
USE holiday_camp_db;


CREATE TABLE REGION (
    id_region CHAR(2) NOT NULL,
    name VARCHAR(20) NOT NULL,
    surface INT NOT NULL,
    inhabitants INT NOT NULL,
    PRIMARY KEY (id_region)
);

CREATE TABLE HOLIDAY_CAMP (
    reference INT NOT NULL,
    name VARCHAR(50) NOT NULL,
    capacity INT NOT NULL,
    id_region CHAR(2), 
    PRIMARY KEY (reference),
    FOREIGN KEY (id_region) REFERENCES REGION(id_region)
);

CREATE TABLE CHILDREN (
    id_card VARCHAR(9) NOT NULL,
    firstname VARCHAR(30) NOT NULL,
    lastname VARCHAR(30) NOT NULL,
    phone VARCHAR(15),
    id_region CHAR(2) NOT NULL, 
    PRIMARY KEY (id_card),
    FOREIGN KEY (id_region) REFERENCES REGION(id_region)
);

CREATE TABLE ACTIVITY (
    id_activity VARCHAR(20) NOT NULL,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY (id_activity)
);

CREATE TABLE OFFERED_BY (
    id_activity VARCHAR(20) NOT NULL,
    reference INT NOT NULL,
    level INT NOT NULL,
    PRIMARY KEY (id_activity, reference),
    FOREIGN KEY (id_activity) REFERENCES ACTIVITY(id_activity),
    FOREIGN KEY (reference) REFERENCES HOLIDAY_CAMP(reference)
);

CREATE TABLE HAS (
    reference INT NOT NULL,
    id_card VARCHAR(9) NOT NULL,
    PRIMARY KEY (reference, id_card),
    FOREIGN KEY (reference) REFERENCES HOLIDAY_CAMP(reference),
    FOREIGN KEY (id_card) REFERENCES CHILDREN(id_card)
);

INSERT INTO REGION (id_region, name, surface, inhabitants) VALUES
('WE', 'Westland', 1500, 500000), 
('NO', 'Northland', 2500, 300000), 
('EA', 'Eastland', 1000, 750000);  

INSERT INTO CHILDREN (id_card, firstname, lastname, phone, id_region) VALUES
('C12345678', 'Alice', 'Smith', '555-1001', 'WE'), 
('C98765432', 'Bob', 'Jones', '555-2002', 'WE'), 
('C00011122', 'Charlie', 'Brown', NULL, 'EA');   

INSERT INTO HOLIDAY_CAMP (reference, name, capacity, id_region) VALUES
(101, 'Sunnyside Camp', 200, 'WE'), 
(102, 'Pine Forest Retreat', 150, 'WE'), 
(103, 'Mountain View', 100, 'NO'); 

INSERT INTO ACTIVITY (id_activity, name) VALUES
('A1', 'Swimming'),
('A2', 'Hiking'),
('A3', 'Archery');

INSERT INTO OFFERED_BY (id_activity, reference, level) VALUES
('A1', 101, 3), 
('A2', 102, 2), 
('A3', 103, 1);

INSERT INTO HAS (reference, id_card) VALUES
(101, 'C12345678'),
(102, 'C98765432');

