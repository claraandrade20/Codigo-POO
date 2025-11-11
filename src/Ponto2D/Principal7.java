package Ponto2D;

public class Principal7 {
	
    public static void main(String[] args) {
    	
        Ponto2D ponto1 = new Ponto2D(); 
        Ponto2D ponto2 = new Ponto2D(3.0, 4.0); 
        Ponto2D ponto3 = new Ponto2D(3.0, 4.0); 
        Ponto2D ponto4 = new Ponto2D(ponto2); 

        System.out.println("Ponto 1: " + ponto1);
        System.out.println("Ponto 2: " + ponto2);
        System.out.println("Ponto 3 (mesmo que Ponto 2): " + ponto3);
        System.out.println("Ponto 4 (cópia do Ponto 2): " + ponto4);

        System.out.println("Ponto 2 é igual a Ponto 3? " + ponto2.equals(ponto3));
        System.out.println("Ponto 2 é igual a Ponto 4? " + ponto2.equals(ponto4));
        
        double distancia = ponto2.distancia(ponto3);
        System.out.println("Distância entre Ponto 2 e Ponto 3: " + distancia);

        ponto1.setX(1.0);
        ponto1.setY(1.0);
        System.out.println("Ponto 1 após alteração: " + ponto1);
        
        distancia = ponto1.distancia(ponto2);
        System.out.println("Distância entre Ponto 1 e Ponto 2: " + distancia);
    }
}

//Classe Principal7
//Método main: Este é o ponto de entrada do programa.
//Cria vários objetos Ponto2D: um na origem, um com coordenadas (3.0, 4.0), e outros como cópias.
//Imprime os detalhes de cada ponto criado.
//Compara o Ponto2D com coordenadas (3.0, 4.0) com outros pontos e imprime os resultados.
//Calcula e imprime a distância entre dois pontos.
//Altera as coordenadas do Ponto2D na origem e imprime o novo estado.
//Calcula e imprime a distância entre o ponto alterado e outro ponto.