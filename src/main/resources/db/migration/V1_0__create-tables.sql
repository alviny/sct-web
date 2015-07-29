create table investor (
	id INT NOT NULL auto_increment,
	account_number VARCHAR(20) NOT NULL,
	PRIMARY KEY (id)
);
create table trade (
	id INT NOT NULL auto_increment,
	symbol VARCHAR(20) NOT NULL,
	trade_date TIMESTAMP NOT NULL,
	price DOUBLE(7,3) NOT NULL,
	PRIMARY KEY(id)
);
create table address (
	line1 VARCHAR(255),
	line2 VARCHAR(255),
	city VARCHAR(50),
	state_province VARCHAR(50),
	country VARCHAR(10)
);
