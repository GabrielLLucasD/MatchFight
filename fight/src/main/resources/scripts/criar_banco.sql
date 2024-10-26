--Script para criacao banco de dados

CREATE TABLE academia (
    id 					serial			primary key,
    nome 				varchar(300) 	not null,
    mestre				varchar(300)	not null,
    contato 			varchar(50) 	not null
);


create table lutador(
	id						serial 				primary key,
	nome					varchar(500) 		not null,
	data_nascimento 		timestamp,
	id_academia				integer				references academia(id),
	disponivel_luta			boolean				not null 
);

	
create table arte(
	id				serial			 primary key,
	nome			varchar(300) 	 not null,
	graduacao		varchar(300)	 not null
);


create table lutador_arte(
	id_lutador integer references lutador(id) on delete cascade,
	id_arte integer references arte(id) on delete cascade,
	primary key (id_lutador, id_arte)
);

create sequence id_lutador
	start with 1
	increment by 10;
	