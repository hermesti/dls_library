create table animal (
	id bigserial primary key,
	name varchar (250) not null
);

create unique index idx_animal_nombre on animal(name);