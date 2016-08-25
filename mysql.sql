create database myone;
use myone;
create table user(id int auto_increment primary key,username varchar(20),password varchar(20));

create database mytwo;
use mytwo;
create table user(id int auto_increment primary key,username varchar(20),password varchar(20));
insert into mytwo.user(username,password) value('test','test');