package Reta;

public class Principal8 {
	
    public static void main(String[] args) {
      
        Ponto8 p1 = new Ponto8(1, 2);
        Ponto8 p2 = new Ponto8(3, 4);
        
        Reta reta1 = new Reta(p1, p2);
        System.out.println(reta1);

        Reta reta2 = new Reta(1, 1); 
        System.out.println(reta2);

        Ponto8 p3 = new Ponto8(2, 3);
        System.out.println("Ponto (2, 3) pertence à reta 1? " + reta1.pontoPertence(p3));

        Ponto8 interseccao = reta1.pontoInterseccao(reta2);
        if (interseccao != null) {
            System.out.println("Ponto de interseção: (" + interseccao.getX() + ", " + interseccao.getY() + ")");
        } else {
            System.out.println("As retas são paralelas.");
        }
    }
}

//Classe Principal8
//Método main: Este é o ponto de entrada do programa.
//Cria dois pontos Ponto8 (p1 e p2) e usa-os para criar uma reta reta1. Imprime a representação da reta.
//Cria uma segunda reta reta2 com coeficientes (1, 1) e imprime a representação.
//Cria um ponto Ponto8 (p3) e verifica se esse ponto pertence à reta1, imprimindo o resultado.
//Calcula o ponto de interseção entre reta1 e reta2. Se o ponto de interseção não for nulo, imprime suas coordenadas; caso contrário, informa que as retas são paralelas.