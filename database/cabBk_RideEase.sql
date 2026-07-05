CREATE DATABASE IF NOT EXISTS cabBk;
USE cabBk;

-- Clean GitHub version generated from your schema.
-- Includes tables: login, loginAdmin, loginDriver, signup, ratings, user, userinfo, newuser, driver, driverdetails, driverpm, driversm, vehicles, book, bookRide, cab2.

CREATE TABLE login(username VARCHAR(25) PRIMARY KEY,password VARCHAR(25));
CREATE TABLE loginAdmin(username VARCHAR(25) PRIMARY KEY,password VARCHAR(25));
INSERT INTO loginAdmin VALUES('admin','admin123');
CREATE TABLE loginDriver(username VARCHAR(25) PRIMARY KEY,password VARCHAR(25));
INSERT INTO loginDriver VALUES('driver','driver123');
CREATE TABLE signup(username VARCHAR(25),password VARCHAR(25));
CREATE TABLE ratings(text1 VARCHAR(50),text2 VARCHAR(50));
INSERT INTO ratings VALUES('Excellent Service','Easy Booking');
CREATE TABLE user(document VARCHAR(25),id VARCHAR(50),age VARCHAR(50),name VARCHAR(50),gender VARCHAR(50),country VARCHAR(50),phone VARCHAR(50),email VARCHAR(50));
CREATE TABLE userinfo(document VARCHAR(25),id VARCHAR(50),age VARCHAR(50),name VARCHAR(50),gender VARCHAR(50),country VARCHAR(50),phone VARCHAR(50),email VARCHAR(50));
CREATE TABLE newuser(document VARCHAR(25),id VARCHAR(50),age VARCHAR(50),name VARCHAR(50),gender VARCHAR(50),country VARCHAR(50),phone VARCHAR(50),email VARCHAR(50));
CREATE TABLE driver(name VARCHAR(25),age VARCHAR(50),gender VARCHAR(50),id VARCHAR(50),licence VARCHAR(50),email VARCHAR(50),phone VARCHAR(50),salary VARCHAR(50),status VARCHAR(50),location VARCHAR(50));
CREATE TABLE driverdetails(name VARCHAR(25),age VARCHAR(50),gender VARCHAR(50),id VARCHAR(50),licence VARCHAR(50),email VARCHAR(50),phone VARCHAR(50),salary VARCHAR(50),status VARCHAR(50),location VARCHAR(50));
CREATE TABLE driverpm(name VARCHAR(25),age VARCHAR(50),gender VARCHAR(50),id VARCHAR(50),licence VARCHAR(50),email VARCHAR(50),phone VARCHAR(50),salary VARCHAR(50),status VARCHAR(50),location VARCHAR(50));
CREATE TABLE driversm(name VARCHAR(25),shift VARCHAR(50),id VARCHAR(50),status VARCHAR(50),type VARCHAR(50));
CREATE TABLE vehicles(number VARCHAR(25),company VARCHAR(25),name VARCHAR(25),status VARCHAR(25),type VARCHAR(25));
CREATE TABLE book(number VARCHAR(25),company VARCHAR(25),type VARCHAR(25));
CREATE TABLE bookRide(location VARCHAR(25),destination VARCHAR(25),route VARCHAR(25));
CREATE TABLE cab2(Auto VARCHAR(25),Bike VARCHAR(50),FiveSeaters VARCHAR(50),SevenSeaters VARCHAR(50),EightSeaters VARCHAR(50),NineSeaters VARCHAR(50),location VARCHAR(50));
INSERT INTO cab2 VALUES
('154','100','205','250','279','364','Bhosari'),('120','95','210','230','264','358','Alandi'),('104','90','200','220','252','350','Moshi'),('149','110','240','250','270','395','Nigdi'),('200','150','300','300','350','450','Hadapsar'),('134','102','260','270','290','400','Chakan'),('160','120','280','270','320','420','Akurdi');