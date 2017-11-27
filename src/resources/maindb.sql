CREATE TABLE cliente (
    cliente_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(100) NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    rg VARCHAR(15) NOT NULL,
    cpf VARCHAR(20) NOT NULL,
    rua VARCHAR(100),
    cidade VARCHAR(100),
    estado VARCHAR(100),
    numero_casa VARCHAR(10),
    bairro VARCHAR(100);
    complemento VARCHAR(50),
    cep VARCHAR(15),
    celular VARCHAR(20),
    telefone VARCHAR(20),
    email VARCHAR(100),
    enabled BOOLEAN
);

CREATE TABLE livro (
    livro_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR (100) NOT NULL,
    autor VARCHAR (100) NOT NULL,
    genero VARCHAR (50) NOT NULL,
    idioma VARCHAR (50) NOT NULL,
    isbn VARCHAR (20) NOT NULL,
    editora VARCHAR (100) NOT NULL,
    edicao VARCHAR (5) NOT NULL,
    estoque INT (5) NOT NULL,
    valor VARCHAR (20) NOT NULL,
    altura VARCHAR (10),
    largura VARCHAR (10),
    peso VARCHAR (10) NOT NULL,
    numero_paginas VARCHAR (10),
    enabled BOOLEAN
);
