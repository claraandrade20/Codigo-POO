package ClasseAluno;

import java.util.Scanner;

public class TestaCadastroAluno {
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            try {
            	System.out.println("Digite a matrícula do aluno:");
                String matricula = scanner.nextLine();
            if (matricula.trim().isEmpty()) {
                    throw new IllegalArgumentException("A matrícula não pode ser vazia.");
                    
            }
                System.out.println("Digite o nome do aluno:");
                String nome = scanner.nextLine();
            if (nome.trim().isEmpty()) {
                    throw new IllegalArgumentException("O nome não pode ser vazio.");      
           }
                System.out.println("Digite o IRA do aluno:");
                double ira = obterIra(scanner);

                System.out.println("Digite o curso do aluno:");
                String curso = scanner.nextLine();

                // Criando um objeto Aluno e adicionando na lista
                Aluno aluno = new Aluno(matricula, nome, ira, curso);
                cadastro.adicionarAluno(aluno);

            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                i--; // Permite ao usuário tentar novamente
            }
        }

        // Ordenando a lista de alunos pela matrícula
        cadastro.ordenarPorMatricula();

        // Imprimindo a lista de alunos ordenada
        System.out.println("\nLista de alunos ordenada pela matrícula:");
        cadastro.imprimirAlunos();

        scanner.close();
    }

    // Método auxiliar para obter um IRA válido
    private static double obterIra(Scanner scanner) {
        double ira = -1;
        boolean iraValido = false;

        while (!iraValido) {
            String entradaIra = scanner.nextLine();
            try {
                ira = Double.parseDouble(entradaIra);
                if (ira < 0 || ira > 10) {
                    System.out.println("Erro: O IRA deve estar entre 0 e 10. Tente novamente.");
                } else {
                    iraValido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: O IRA deve ser um número. Tente novamente.");
            }
        }
        return ira;
    }
}