
CREATE DATABASE db_generation_game_onlinE;
USE db_generation_game_onlinE;


CREATE TABLE tb_classes(
  id BIGINT NOT NULL AUTO_INCREMENT,
  classe VARCHAR(255) NOT NULL,
  elemento VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);



CREATE TABLE tb_personagens(
	id BIGINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	ataque INT NOT NULL,
	defesa INT NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	classes_id BIGINT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (classes_id) REFERENCES tb_classes (id)
   );


INSERT  INTO tb_classes(classe, elemento) VALUES
	("Elfo", "Vento"),
    ("Guerreiro", "Terra"),
    ("Dragão", "Fogo"),
    ("Pirata", "Água"),
    ("Monge", "Luz"),
    ("Vampiro", "Trevas");
    
INSERT INTO tb_personagens(nome, ataque, defesa, descricao, classes_id) VALUES
	("Landrus Kaldert", 2500, 1500, "Grande Imperador de Darkire, Landrus é um idealista que odeia que insultem sua nação: 'Qualquer um que insulta meu país deve morrer!'", 6),
    ("Ongi Gulgeren", 2300, 2300, "Sábio e Iluminado, o Monge de Kulkuartan é um idelista que busca sempre pelo equilíbrio das coisas: 'A Paz mora no equilíbrio!'", 5),
	("Isiah Barkley", 2700, 1300, "Ágil, malandro e charmoso, Isiah é um amante da liberade que só os mares podem proporcionar: 'Nada como a libertação pela água e pelo sal!'", 4),
    ("Alyndra Flinntar", 1900, 1800, "Bela e habilidosa, Alyndra pode ser brisa ou furacão dependendo da situação: 'A Natureza sempre prevalecerá!'", 1),
    ("Maura Morgan", 1700, 2400, "Melhor guerreira do Exército Real de Strongearth, Maura estremece com qualquer campo de batalha: 'A Terra deve ser abençoada por sangue, suor e lágrimas!'", 2),
    ("Lynnphoras, A Rainha da Chama Eterna", 3500, 2800, "Com chamas mais ardentes e destrutivas que o núcleo do planeta, Lynnphoras lidera o Estompido Drâconico por mais tempo que e existência das civilizações que regem o mundo atual: 'Do Fogo viemos, ao Fogo voltaremos!'", 3),
    ("Xyrmacre, A Antítese da Vida", 4000, 3100, "Desaparecido há milênios, Xyrmacre retorna com uma única meta, a de detruir tudo que estiver em seu caimnho:'A vida só existe para uma coisa: ser extirpada desse plano!'", 3),
    ("Annmarie Gallagher", 2200, 2100, "Eterna amante de Landrus, Annmarie é a verdadeira síntese da ´luxúria terrena: 'O que seria do amor e do desejo sem o sangue?'", 6);
    
SELECT * FROM tb_personagens WHERE ataque > 2000;

SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nome LIKE "%C%";

SELECT * FROM tb_personagens 
	INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id;
    
SELECT * FROM tb_personagens 
	INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id
    WHERE tb_classes.classe = "Dragão";