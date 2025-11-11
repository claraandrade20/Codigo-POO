package TesteMapaAluno;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        // Criando um mapa para armazenar os alunos, onde a chave é a matrícula e o valor é o objeto Aluno
        Map<String, Aluno> mapaAlunos = new HashMap<>();

        // Adicionando 5 alunos ao mapa
        mapaAlunos.put("12345", new Aluno("12345", "Pedro", 8.5, "Engenharia"));
        mapaAlunos.put("67890", new Aluno("67890", "Cecília", 9.2, "Medicina"));
        mapaAlunos.put("11223", new Aluno("11223", "Matheus", 7.8, "Direito"));
        mapaAlunos.put("44556", new Aluno("44556", "Ana", 8.9, "Arquitetura"));
        mapaAlunos.put("77889", new Aluno("77889", "Clara", 9.5, "Computação"));

        Scanner scanner = null;
        try {
            // Lendo a matrícula do teclado
            scanner = new Scanner(System.in);
            System.out.print("Digite a matrícula do aluno(5 digitos): ");
            String matricula = scanner.nextLine();

            // O código verifica se a matrícula está vazia
            if (matricula.trim().isEmpty()) {
                throw new IllegalArgumentException("A matrícula não pode ser vazia.");
                }   
            
            if (matricula.length() != 5) {
                throw new IllegalArgumentException("A matrícula deve ter exatamente 5 dígitos.");
                }
           
            // Buscando o aluno no mapa pela matrícula
            Aluno aluno = mapaAlunos.get(matricula);

            // Verificando se o aluno existe no mapa
            if (aluno != null) {
                System.out.println("Dados do aluno: " + aluno);
            } else {
                System.out.println("Aluno não encontrado!");
            }

        } catch (IllegalArgumentException e) {
            // Tratamento para exceções específicas de argumento inválido
            System.out.println("Erro: " + e.getMessage());

        } catch (Exception e) {
            // Tratamento para qualquer outra exceção inesperada
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());

        } finally {
            if (scanner != null) {
                scanner.close();  // Garantir que o Scanner seja fechado
            }
        }
    }
}

//Estrutura do Tratamento de Exceções

//try Block: O código que pode gerar exceções é envolto em um bloco try. Aqui, você lê a matrícula do aluno e a busca no mapa.

//catch Blocks: Após o bloco try, existem dois blocos catch:
//O primeiro catch captura IllegalArgumentException, que é lançada quando a matrícula fornecida pelo usuário está vazia.
//O segundo catch captura uma Exception genérica, lidando com qualquer outro tipo de erro que possa ocorrer.

//finally Block: Este bloco é executado após o try e catch, independentemente de uma exceção ter sido lançada ou não. 
//Ele é usado aqui para garantir que o Scanner seja fechado, evitando possíveis vazamentos de recursos.
