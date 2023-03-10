CREATE DATABASE db_registroescola;

USE db_registroescola;

CREATE TABLE tb_estudantes(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    nota DECIMAL(4, 2),
    matricula VARCHAR(255),
    turma VARCHAR(255),
    periodo VARCHAR(255),
    transporte BOOLEAN
);

INSERT INTO tb_estudantes(nome, nota, matricula, turma, periodo, transporte) VALUES
	("Jonas", 10.00, "40028922", "Brothers", "Integral", true),
    ("Wallace", 6.30, "44874430", "Bonde do Tigrão", "Noturno", true),
    ("Joe", 10.00, "77777", "Brothers", "Integral", true),
    ("Gêci", 10.00, "40028922", "Brothers", "Integral", true),
    ("Tereza", 10.00, "40028922", "Brothers", "Integral", true),
    ("Cléubio", 10.00, "40028922", "Brothers", "Integral", true),
    ("Nick", 10.00, "40028922", "Brothers", "Integral", true),
    ("Kelvin", 10.00, "40028922", "Brothers", "Integral", true);
    
SELECT * FROM tb_estudantes;

SELECT * FROM tb_estudantes WHERE nota > 7;

SELECT * FROM tb_estudantes WHERE nota < 7;

UPDATE tb_estudantes SET matricula = (CASE 
	WHEN id = 1 THEN "707070"
	WHEN id = 2 THEN "123445"
	WHEN id = 3 THEN "909013"
END)
WHERE id IN (1, 2, 3);

SELECT * FROM tb_estudantes;
