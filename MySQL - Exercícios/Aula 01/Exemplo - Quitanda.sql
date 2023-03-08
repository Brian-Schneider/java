-- comando para criação de Banco de Dados
CREATE DATABASE db_quitanda;

-- comando que indica ao MySQL Workbench o Banco de Dados utilizado
USE db_quitanda;

-- criando tabela de produtos
CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(255),
    preco DECIMAL(6,2)
);

-- comando que traz todos os dados da tabela de produtos
SELECT * FROM tb_produtos; 

-- insere insere valores a tabela
INSERT INTO tb_produtos(nome_produto, preco) VALUES ("Banana", 7.00);

-- desativa o modo seguro do MySQL e permite UPDATE e DELETE
SET SQL_SAFE_UPDATES = 0;

-- atualização de um dadodentro da minha tabela
UPDATE tb_produtos SET preco = 7.90 WHERE id=2;



