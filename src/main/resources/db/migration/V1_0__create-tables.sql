create table investor (
	id INT NOT NULL auto_increment,
	account_number VARCHAR(20) NOT NULL,
	PRIMARY KEY (id)
);
create table address (
	line1 VARCHAR(255),
	line2 VARCHAR(255),
	city VARCHAR(50),
	state_province VARCHAR(50),
	country VARCHAR(10)
);
