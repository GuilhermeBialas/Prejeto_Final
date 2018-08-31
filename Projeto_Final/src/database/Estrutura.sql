
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
<<<<<<< HEAD
insert into produtos(categoria, quantidade, valor, descricao, aplicacao, unidade_de_medida,
 localizacao, valor_unitario, status_peca, peso)values
('motor',2,2000,'motor para uno','motor para uno ano/2000','kit','Santa Catarina',2000,'novo',100);
=======


>>>>>>> d77dea65557ecb6f15643a104b6a4f2a4c234e99
