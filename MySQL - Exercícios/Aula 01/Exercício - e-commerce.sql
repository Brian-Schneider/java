CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    preco DECIMAL(6,2),
    categoria VARCHAR(255),
    quantidade_estoque INT,
    marca VARCHAR(255)
);

INSERT INTO tb_produtos(nome, preco, categoria, quantidade_estoque, marca) VALUES
	("Smartphone Galaxy A13 128GB Azul", 1399.00, "Celulares e Smartphones", 1000, "Samsung"),
	("Amaciante Concentrado Frescor da Primavera - 1,5L", 29.99, "Produtos de Limpeza", 20000, "Downy"),
	("Jogo de Panelas Antiaderente de Alumínio - Grafite 14 Peças Especial", 289.90, "Utilidades Domésticas", 3000, "Eirilar"),
	("Guarda-roupa Casal com Espelho 4 Portas 4 Gavetas", 999.00, "Móveis", 5000, "Araplac"),
	("Cama Box Casal (Box + Colchão)", 1199.00, "Colchões", 500, "Plumatex"),
	("Geladeira Frost Free 443L Inox", 5000.00, "Eletrodomésticos", 2500, "Brastemp"),
	("Fritadeira Elétrica sem Óleo/Air Fryer - Preta 3,5L", 409.00, "Eletroportáteis", 6000, "Mondial"),
	("Pneu Aro 14", 399.00, "Automotivo", 7000, "Goodyear");

SELECT * FROM tb_produtos WHERE preco > 500; 
SELECT * FROM tb_produtos WHERE preco < 500;

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_produtos SET 
	nome = "Smartphone Galaxy A13 128GB Preto",
	preco = 1599.00,
	quantidade_estoque = 3500
WHERE id = 1;

SELECT * FROM tb_produtos WHERE id = 1;


