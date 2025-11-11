package ConjuntoDePalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    private Set<String> palavras;

    // Construtor que inicializa o conjunto com palavras fornecidas
    public ConjuntoDePalavras(String[] palavrasIniciais) {
    	 palavras = new HashSet<>();
         for (String palavra : palavrasIniciais) {
             if (palavra != null) {
                 palavras.add(palavra);
             } else {
                 throw new IllegalArgumentException("Palavra não pode ser nula.");
             }
         } 
        palavras = new HashSet<>();
        for (String palavra : palavrasIniciais) {
            if (palavra != null && !palavra.trim().isEmpty()) {
                palavras.add(palavra.trim());
            }
        }
    }

    // Método que verifica se todas as palavras na string de entrada estão no conjunto
    public boolean contemTodas(String palavrasParaVerificar) {
        if (palavrasParaVerificar == null) {
            throw new IllegalArgumentException("A string de palavras a ser verificada não pode ser nula.");
        }

        String[] palavrasArray = palavrasParaVerificar.split(" ");
        for (String palavra : palavrasArray) {
            if (!this.palavras.contains(palavra.trim())) {
                return false; // Retorna falso se alguma palavra não estiver no conjunto
            }
        }
        return true; // Retorna verdadeiro se todas as palavras estiverem no conjunto
    }

    // Método para exibir as palavras no conjunto (opcional, para testes)
    public void exibirPalavras() {
        System.out.println("Conjunto de palavras: " + palavras);
    }

    public static void main(String[] args) {
        try {
            // Exemplo de uso da classe
            String[] palavrasIniciais = {"cachorro", "gato", "pássaro"};
            ConjuntoDePalavras conjunto = new ConjuntoDePalavras(palavrasIniciais);

            // Testar o método contemTodas
            String palavrasParaVerificar = "cachorro gato";
            boolean resultado = conjunto.contemTodas(palavrasParaVerificar);
            System.out.println("Contém todas as palavras? " + resultado);

            // Testando com uma palavra que não está no conjunto
            palavrasParaVerificar = "cachorro coelho";
            resultado = conjunto.contemTodas(palavrasParaVerificar);
            System.out.println("Contém todas as palavras? " + resultado);
            
            // Testando exceção com entrada nula
            conjunto.contemTodas(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}