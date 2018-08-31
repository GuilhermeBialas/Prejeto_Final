
DROP DATABASE IF EXISTS auto_pecas;
CREATE DATABASE auto_pecas;
USE auto_pecas;

CREATE TABLE produtos(
    id int AUTO_INCREMENT PRIMARY KEY,
    categoria         varchar(50),
    quantidade        float,
    valor             float,
    descricao         Varchar(150),
    aplicacao         varchar(300),
    unidade_de_medida varchar(5),
    localizacao       varchar (50),
    valor_unitario    float,
    status_peca       varchar(20),
    peso              float
);


