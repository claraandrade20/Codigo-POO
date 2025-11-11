package Circulo;

import java.util.Scanner;

public class Principal1 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada x do centro do círculo: ");
        double x = scanner.nextDouble();
        System.out.print("Digite a coordenada y do centro do círculo: ");
        double y = scanner.nextDouble();
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        Ponto1 centro = new Ponto1(x, y);
        Circulo circulo = new Circulo(raio, centro);
        
        System.out.println(circulo);
        System.out.println("Área: " + circulo.area());

        System.out.print("Digite um valor para inflar o círculo: ");
        double inflarValor = scanner.nextDouble();
        circulo.inflar(inflarValor);
        System.out.println("Após inflar: " + circulo);
        System.out.println("Área: " + circulo.area());

        System.out.print("Digite um valor para desinflar o círculo: ");
        double desinflarValor = scanner.nextDouble();
        circulo.desinflar(desinflarValor);
        System.out.println("Após desinflar: " + circulo);
        System.out.println("Área: " + circulo.area());

        scanner.close();
    }
}

//Classe Principal1
//Cria um objeto Scanner para leitura de entrada do usuário.
//Solicita ao usuário que insira as coordenadas x e y do centro do círculo.
//Solicita ao usuário que insira o raio do círculo.
//Cria um objeto Ponto1 com as coordenadas fornecidas.
//Cria um objeto Circulo usando o raio e o centro fornecidos.
//Imprime a representação do círculo e sua área.
//Solicita um valor para "inflar" (aumentar) o raio do círculo.
//Aplica a inflação ao círculo e imprime o novo estado e área.
//Solicita um valor para "desinflar" (diminuir) o raio do círculo.
//Aplica a desinflação ao círculo e imprime o novo estado e área.
//Fecha o objeto Scanner para liberar recursos.
