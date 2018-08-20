
DROP DATABASE IF EXISTS auto_pecas;
CREATE DATABASE auto_pecas;
USE auto_pecas;

CREATE TABLE pecas(
    id int AUTO_INCREMENT PRIMARY KEY,
    categoria         VARCHAR(50),
    quantidade        FLOAT,
    valor             FLOAT,
    descricao         Varchar(150),
    aplicacao         VARCHAR(300),
    unidade_de_medida varchar(5),
    localizacao       varchar (50),
    valor_unitario    float,
    status_peca       varchar(20)
);
