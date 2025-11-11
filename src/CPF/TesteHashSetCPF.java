package CPF;

import java.util.HashSet;
import java.util.Scanner;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        HashSet<String> cpfSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // a) Adicionando 10 CPF Strings informados pelo usuário
        System.out.println("Digite 10 CPF (apenas números, 11 dígitos):");
        for (int i = 0; i < 10; i++) {
            String cpf;
            while (true) {
                System.out.print("CPF " + (i + 1) + ": ");
                cpf = scanner.nextLine();
                
                // Verifica se o CPF é válido (11 dígitos e apenas números)
                if (cpf.matches("\\d{11}")) {
                    cpfSet.add(cpf); // Adiciona o CPF ao HashSet
                    break; // Sai do laço se a entrada for válida
                } else {
                    System.out.println("CPF inválido. Por favor, digite um CPF válido (11 dígitos).");
                }
            }
        }

        // b) Verificando o conteúdo do HashSet
        System.out.println("\nConteúdo do HashSet (sem duplicados):");
        for (String cpf : cpfSet) {
            System.out.println(cpf);
        }

        // c) Testando a adição de CPFs repetidos
        System.out.println("\nDigite mais 5 CPF para testar duplicatas:");
        for (int i = 0; i < 5; i++) {
            String cpfRepetido;
            while (true) {
                System.out.print("CPF repetido " + (i + 1) + ": ");
                cpfRepetido = scanner.nextLine();
                
                // Verifica se o CPF é válido (11 dígitos e apenas números)
                if (cpfRepetido.matches("\\d{11}")) {
                    cpfSet.add(cpfRepetido); // Tenta adicionar um CPF repetido
                    break; // Sai do laço se a entrada for válida
                } else {
                    System.out.println("CPF inválido. Por favor, digite um CPF válido (11 dígitos).");
                }
            }
        }

        // d) Mostrando o conteúdo final do HashSet
        System.out.println("\nConteúdo final do HashSet:");
        for (String cpf : cpfSet) {
            System.out.println(cpf);
        }

        scanner.close();
    }
}
