DROP DATABASE IF EXISTS universidade;
CREATE DATABASE universidade;
USE universidade;

CREATE TABLE cursos(
    id_curso int NOT NULL AUTO_INCREMENT,
    nome_curso varchar (30) NOT NULL,
    coord_curso varchar (30) NOT NULL,
    PRIMARY KEY (id_curso)
);

CREATE TABLE disciplinas(
    id_disciplina int NOT NULL AUTO_INCREMENT,
    nome_disciplina varchar (30) NOT NULL, 
    horas_disciplina int NOT NULL,
    descricao_disciplina varchar (200) NOT NULL,
    PRIMARY KEY (id_disciplina)
);

CREATE TABLE disciplinas_curso(
    id_curso int NOT NULL,
    id_disciplina int NOT NULL,
    PRIMARY KEY (id_curso, id_disciplina)
    FOREIGN KEY (id_curso) REFERENCES cursos(id_curso),
    FOREIGN KEY (id_disciplina) REFERENCES cursos(id_disciplina)
);

CREATE TABLE alunos (
    id_aluno int NOT NULL AUTO_INCREMENT,
    nome-aluno varchar (100) NOT NULL,
    cpf_aluno varchar (11) NOT NULL,
    id_curso int NOT NULL,
    PRIMARY KEY (id_aluno),
    FOREIGN KEY (id_curso) REFERENCES cursos(id_curso)
);


INSERT INTO cursos VALUES 
            (1, "Biologia", "Ana Grizz"), 
            (2, "Letras", "Cristina Polera"), 
            (3, "Engenharia Eletrica", "pablo Tisseau"), 
            (4, "Artes Visuais", "Daniel Fabris");

INSERT INTO disciplinas VALUES 
            (1, "Sapologia", 30, "Altos sapos"), 
            (2, "Sapologia", 30, "Altos sapos"), 
            (3, "Sapologia", 30, "Altos sapos"),
            (4, "Sapologia", 30, "Altos sapos"),
            (5, "Sapologia", 30, "Altos sapos"), 
            (6, "Sapologia", 30, "Altos sapos");

INSERT INTO alunos VALUES 
            (1, "Juliano", 23213213, 1), 
            (2, "Pedro", 252144213, 2), 
            (3, "Ana", 2329604323, 2),
            (4, "Beatriz", 232164323, 3), 
            (5, "Frederico", 573813213, 4);