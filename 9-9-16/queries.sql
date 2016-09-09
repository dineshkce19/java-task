create user 'admin'@'localhost' identified by 'password';

create database LaptopService;

use database LaptopService;

create table user_info(identity int primary key auto_increment, firstName varchar(256) not null, lastName varchar(128) default '', phoneNumber varchar(20) default '', mobileNumber varchar(20) not null, emailIdentity varchar(256) default '', website varchar(256) default '', profilePicture mediumblob default '');

desc user_info;

create table service_info( serviceId int primary key auto_increment ,laptopModel varchar(30) , laptopId varchar(30) , userId int unique , email varchar(50) );

desc service_info;

insert into user_info(firstName, lastName, phoneNumber, mobileNumber, emailIdentity, website, profilePicture) values('vijay', '', '', '9698731155', 'msgtovp@gmail.com', 'http://www.microcript.co.in', '');

select * from user_info;

insert into service_info(laptopModel,laptopId,userId,email)values('Dell inspiron 3000 series','123a-b43s-143t-1111',1,'msgtovp@gmail.com');
