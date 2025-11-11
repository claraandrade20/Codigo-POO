package ConjuntoDePalavras;

public class Principal {
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
