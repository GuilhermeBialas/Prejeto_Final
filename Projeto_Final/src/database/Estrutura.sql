
DROP DATABASE IF EXISTS auto_pecas;
CREATE DATABASE auto_pecas;
USE auto_pecas;

CREATE TABLE produtos(
    id int AUTO_INCREMENT PRIMARY KEY,
    categoria         varchar(50),
    quantidade        int,
    valor             float,
    descricao         Varchar(150),
    aplicacao         varchar(300),
    unidade_de_medida varchar(5),
    localizacao       varchar (50),
    valor_unitario    float,
    status_peca       varchar(20),
    peso              float
);

insert into produtos(categoria, quantidade, valor, descricao, aplicacao, unidade_de_medida,
 localizacao, valor_unitario, status_peca, peso)values
('motor',2,2000,'motor para uno','motor para uno ano/2000','kit','Santa Catarina',2000,'novo',100),
('parachoque',5,5000,'parachoque para fiesta','parachoque para fiesta/2005','kit','São Paulo',2000,'semi novo',600),
('Acessorios',8,12000,'rodas Unique','rodas originais do Nissan New Versa Unique','Peça','Santa Catarina',400,'Semi-novo',5);



CREATE TABLE clientes(

nome VARCHAR(100),
telefone VARCHAR(15),
cpf_cnpj VARCHAR(25),
cep      varchar(25),
bairro   varchar(25),
endereco varchar(50),
cidade   Varchar(50),
numero   INT,
logradouro varchar(50),
email varchar(50)
);

CREATE table funcionarios(
nome VARCHAR(50),
cpf VARCHAR(20),
cep VARCHAR(50),
bairro varchar(50),
endereco varchar(50),
cidade  varchar(50),
email VARCHAR(50)
);








