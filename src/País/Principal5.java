package País;

public class Principal5 {
	
    public static void main(String[] args) {
    	
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        brasil.setPopulacao(193946886);

        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        argentina.setPopulacao(45195777);

        brasil.adicionarFronteira(argentina);

        System.out.println(brasil);
        System.out.println("Densidade populacional: " + brasil.calcularDensidadePopulacional());
        System.out.println("É igual à Argentina? " + brasil.equals(argentina));
    }
}

//Classe Principal5
//Método main: Este é o ponto de entrada do programa.
//Cria um objeto Pais para o Brasil com código ISO e dimensão.
//Define a população do Brasil.
//Cria um objeto Pais para a Argentina com código ISO e dimensão.
//Define a população da Argentina.
//Adiciona a Argentina como uma fronteira do Brasil.
//Imprime informações sobre o Brasil, incluindo sua representação em string.
//Calcula e imprime a densidade populacional do Brasil.
//Compara o Brasil com a Argentina e imprime o resultado da comparação.