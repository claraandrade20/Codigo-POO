package ClasseAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Classe Aluno com os atributos matrícula, nome, IRA e curso
class Aluno {
    private String matricula;
    private String nome;
    private double ira;
    private String curso;

    // Construtor da classe Aluno
    public Aluno(String matricula, String nome, double ira, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.ira = ira;
        this.curso = curso;
    }

    // Getters para acessar os atributos da classe
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getIra() {
        return ira;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Aluno [Matrícula: " + matricula + ", Nome: " + nome + ", IRA: " + ira + ", Curso: " + curso + "]";
    }
}