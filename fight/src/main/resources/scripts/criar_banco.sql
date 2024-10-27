-- Script para criação do banco de dados

CREATE TABLE academia (
    id          serial 				PRIMARY KEY,
    nome        varchar(300) 		NOT NULL,
    mestre      varchar(300) 		NOT NULL,
    telefone    varchar(50) 		NOT NULL,
    email       varchar(50) 		NOT NULL,
    arte        varchar(100) 		NOT NULL
);

CREATE TABLE lutador (
    id              		serial 				PRIMARY KEY,
    nome            		varchar(500) 		NOT NULL,
    data_nascimento 		timestamp 			NOT NULL,
    peso            		double precision 	NOT NULL,
    id_academia     		integer 			REFERENCES academia(id),
    graduacao       		varchar(300) 		NOT NULL,
    disponivel_luta 		boolean 			NOT NULL
);
