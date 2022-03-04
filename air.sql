drop database air;
create database air;

use air;

create table aviaTicket(
    id int primary key NOT NULL AUTO_INCREMENT,
    place int,
    flight_id int,
    classAvia_id int
);

create table aviaTicketTourPackage(
    aviaTicket_id int,   
    tourPackage_id int  
);

create table eventTicket(
    id int primary key NOT NULL AUTO_INCREMENT,
    place int,
    event_id int
);

create table tourPackageTicket(
    eventTicket_id int,   
    tourPackage_id int
);

create table hotel(
    id int primary key NOT NULL AUTO_INCREMENT,
    city varchar(20),
    `name` varchar(20),
    classHotel_id int,
    tour_id int 
);

create table `contract`(
    id int primary key NOT NULL AUTO_INCREMENT,
    client_id int,   
    tour_id int,   
    registrationDate date,
    contractNumber int
);

create table `position`(
    id int primary key NOT NULL AUTO_INCREMENT,
    position varchar(20)
);

create table tourTask(
    id int primary key NOT NULL AUTO_INCREMENT,
    employee_id int,   
    tour_id int,   
    `description` varchar(40),
    executionTime date,
    `status` binary
);

create table category(
    id int primary key NOT NULL AUTO_INCREMENT,
    category varchar(20)
);

create table classAvia(
    id int primary key NOT NULL AUTO_INCREMENT,
    class varchar(20)
);

create table classHotel(
    id int primary key NOT NULL AUTO_INCREMENT,
    class varchar(20)
);

CREATE TABLE `client`(
    id int NOT NULL AUTO_INCREMENT,
    `name` varchar(20),
    `address` varchar(20),
    client_number int,
    tel_number int,
    
    PRIMARY KEY(id)
);

CREATE TABLE `event`(
    id int NOT NULL AUTO_INCREMENT,
    city varchar(20),
    place char(18),
    `start_time` date,
    tour_id int,  

    PRIMARY KEY(id)
);


CREATE TABLE room(
    id int NOT NULL AUTO_INCREMENT,
    hotel_id int,  
    arrival_date date,
    category_id int,  
    place_in_hotel int,
    departure_date date,
    
    PRIMARY KEY(id)
);

CREATE TABLE tourPackageRoom(
    id int NOT NULL AUTO_INCREMENT,
    room_id int,  
    tourPackage_id int,  
    
    PRIMARY KEY(id)
);

CREATE TABLE `order`(
    id int NOT NULL AUTO_INCREMENT,
    tour_id int, 
    employee_id int,  
    order_number int,
    
    PRIMARY KEY(id)
);

CREATE TABLE program(
    id int NOT NULL AUTO_INCREMENT,
    program_number int,
    `description` varchar(20),
    
    PRIMARY KEY(id)
);

CREATE TABLE tourPackage(
    id int NOT NULL AUTO_INCREMENT,
    tourist_id int,  
    aviaTicketTourPackage_id int,  
    tour_package_number int,
    
    PRIMARY KEY(id)
);

CREATE TABLE tourFlight(
    id int NOT NULL AUTO_INCREMENT,
    flight_number int,
    air_company varchar(20),
    tour_number int,  
    departure_date date,
    departure_time date,
    arrival_city varchar(20),
    departure_city varchar(20),
    direction varchar(20),
    
    PRIMARY KEY(id)
);

CREATE TABLE employee(
    id int NOT NULL AUTO_INCREMENT,
    passport_number int,
    position_id int,
    `name` varchar(20),
    `address` varchar(20),
    
    PRIMARY KEY(id)
);

CREATE TABLE country(
    id int NOT NULL AUTO_INCREMENT,
    country varchar(20),
    
    PRIMARY KEY(id)
);

CREATE TABLE tourType(
    id int NOT NULL AUTO_INCREMENT,
    tour_type varchar(20),
    
    PRIMARY KEY(id)
);

CREATE TABLE tour(
    id int NOT NULL AUTO_INCREMENT,
    tour_number varchar(20),
    tour_type_id int,  
    country_id int,  
    `start_date` date,
    end_date date,
    program_number int,  
    `name` varchar(20),
    `status` varchar(20),
    
    PRIMARY KEY(id)    
);

CREATE TABLE tourist(
    id int NOT NULL AUTO_INCREMENT,
    passport_number int,
    `name` varchar(20),
    age char(18),
    `address` varchar(20),
    
    PRIMARY KEY(id)
);

    ALTER TABLE eventTicket add FOREIGN KEY (event_id) REFERENCES `event`(id);

    ALTER TABLE aviaTicket add FOREIGN KEY (flight_id) REFERENCES tourFlight(id);
    ALTER TABLE aviaTicket add FOREIGN KEY (classAvia_id) REFERENCES classAvia(id);

    ALTER TABLE aviaTicketTourPackage add FOREIGN KEY (aviaTicket_id) REFERENCES aviaTicket(id);
    ALTER TABLE aviaTicketTourPackage add FOREIGN KEY (tourPackage_id) REFERENCES tourPackage(id);

    ALTER TABLE tourPackageTicket add FOREIGN KEY (eventTicket_id) REFERENCES eventTicket(id);
    ALTER TABLE tourPackageTicket add FOREIGN KEY (tourPackage_id) REFERENCES tourPackage(id);

    ALTER TABLE hotel add FOREIGN KEY (tour_id) REFERENCES tour(id);
    ALTER TABLE hotel add FOREIGN KEY (classHotel_id) REFERENCES classHotel(id);

    ALTER TABLE employee add FOREIGN KEY (position_id) REFERENCES position(id);

    ALTER TABLE `contract` add FOREIGN KEY (client_id) REFERENCES client(id);
    ALTER TABLE `contract` add FOREIGN KEY (tour_id) REFERENCES tour(id);
    
    ALTER TABLE tourTask add FOREIGN KEY (employee_id) REFERENCES employee(id);
    ALTER TABLE tourTask add FOREIGN KEY (tour_id) REFERENCES tour(id);

    alter table `event` add FOREIGN KEY (tour_id) REFERENCES tour(id);

    alter table room add FOREIGN KEY (category_id) REFERENCES category(id);

    alter table tourPackageRoom add FOREIGN KEY (room_id) REFERENCES room(id);
    alter table tourPackageRoom add FOREIGN KEY (tourPackage_id) REFERENCES tourPackage(id);

    alter table `order` add FOREIGN KEY (tour_id) REFERENCES tour(id);
    alter table `order` add FOREIGN KEY (employee_id) REFERENCES employee(id);

    alter table tourPackage add FOREIGN KEY (tourist_id) REFERENCES tourist(id);
    alter table tourPackage add FOREIGN KEY (aviaTicketTourPackage_id) REFERENCES aviaTicketTourPackage(id);

    alter table tourFlight add FOREIGN KEY (tour_number) REFERENCES tour(id);

    alter table tour add FOREIGN KEY (tour_type_id) REFERENCES tourType(id);
    alter table tour add FOREIGN KEY (country_id) REFERENCES country(id);
    alter table tour add FOREIGN KEY (program_number) REFERENCES program(id);