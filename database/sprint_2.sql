create database sprint_2;
use sprint_2;

create table roles(
id_role int primary key auto_increment,
name varchar(250)
);

create table users(
id_user int primary key auto_increment,
name varchar(250),
birthday date,
gender varchar(50),
email varchar(250),
phone varchar(50),
address varchar(250),
id_role int,
foreign key(id_role) references roles(id_role)
);

create table categories(
id_category int primary key auto_increment,
name varchar(250)
);

create table products(
id_product int primary key auto_increment,
name varchar(250),
weight double ,
price double, 
brand varchar(250),
origin varchar(250),
`description` longtext,
quantity int,
id_category int,
foreign key(id_category) references categories(id_category)
);

create table images(
id_image  int primary key auto_increment,
name varchar(250),
id_product int,
foreign key(id_product) references products(id_product)

);

create table orders(
id_order int primary key auto_increment,
date_of_order date,
total_money double,
id_user int,
foreign key(id_user) references users(id_user)
);

create table order_details(
id_order_detail int primary key auto_increment,
quantity int,
price_order double,
id_order int, 
id_product int,
foreign key(id_order) references orders(id_order),
foreign key(id_product) references products(id_product)
);

create table carts(
id_cart int primary key auto_increment,
quantity_order int,
id_user int,
id_product int,
foreign key(id_user) references users(id_user),
foreign key(id_product) references products(id_product)
);




