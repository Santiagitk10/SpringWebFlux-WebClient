DROP TABLE IF EXISTS users;
create table users(id serial primary key, name varchar(255),surname varchar(255),email varchar(255),username varchar(255),password varchar(255))

-- Con r2dbc no se cuenta con un ORM entonces hay que hacer el seteo del sql. 
-- un ORM como hibernate por ejemplo es blocking entonces se necesita que se non blocking