CREATE TABLE IF NOT EXIST cliente (
	id serial PRIMARY KEY,
	firstName varchar(20),
	lasName varchar(20),
	email varchar(50),
	senha varchar(50)
);