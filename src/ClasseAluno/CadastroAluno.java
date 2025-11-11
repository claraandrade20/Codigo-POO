package ClasseAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class CadastroAluno {
 private List<Aluno> alunos;

 // Construtor da classe CadastroAluno inicializando a lista
 public CadastroAluno() {
     alunos = new ArrayList<>();
 }

 // Método para adicionar um novo aluno
 public void adicionarAluno(Aluno aluno) {
     alunos.add(aluno);
 }

 // Método para ordenar a lista de alunos pela matrícula
 public void ordenarPorMatricula() {
     Collections.sort(alunos, Comparator.comparing(Aluno::getMatricula));
 }

 // Método para imprimir todos os alunos da lista
 public void imprimirAlunos() {
     for (Aluno aluno : alunos) {
         System.out.println(aluno);
     }
 }
}