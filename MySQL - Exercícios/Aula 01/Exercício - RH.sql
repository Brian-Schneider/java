CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcionarios(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    salario DECIMAL(8,2),
    cpf VARCHAR(255),
    cor VARCHAR(255),
    genero VARCHAR(255)
);

INSERT INTO tb_funcionarios(nome, salario, cpf, cor, genero) VALUES
("Brian", 6700.00, "444.555.666-05", "Branco", "Masculino"),
("Roberta", 5000.00, "432.234.899-12", "Branco", "Feminino"),
("Marian", 5300.00, "467.888.912-45", "Negro", "Não Binário"),
("Santos", 1800.00, "387.498.612-10", "Branco", "Masculino"),
("Luiza", 1900.00, "345.657.879-43", "Branco", "Feminino");

SELECT * FROM tb_funcionarios WHERE salario > 2000;
SELECT * FROM tb_funcionarios WHERE salario < 2000;

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_funcionarios SET salario = 2400.00 WHERE id = 5;
