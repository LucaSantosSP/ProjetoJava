CREATE TABLE IF NOT EXISTS cliente (
	id serial PRIMARY KEY,
	name text,
	lastname text,
	email text,
	senha text
);

CREATE TABLE IF NOT EXISTS produto (
	id serial PRIMARY KEY,
	nproduc text,
	ndescricao text,
	nselo text,
	npontoVenda text
);