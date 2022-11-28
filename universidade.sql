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