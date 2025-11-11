package Conta;

public class Principal {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        try {
            // Criando objetos que implementam Tributável
            Rendimento rendimento1 = new Rendimento(5000, 0.15); // 15% de imposto
            Rendimento rendimento2 = new Rendimento(10000, 0.2); // 20% de imposto
            Bens bem1 = new Bens(30000, 0.1); // 10% de imposto sobre bens

            // Adicionando os tributos ao gerenciador
            gerenciador.adicionar(rendimento1);
            gerenciador.adicionar(rendimento2);
            gerenciador.adicionar(bem1);

            // Mostrando o total de tributos
            System.out.printf("Total de Imposto de Renda a pagar: %.2f%n", gerenciador.getTotalTributos());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
