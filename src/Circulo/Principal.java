package Circulo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Criando uma lista para armazenar os objetos Círculo
        List<Circulo> circulos = new ArrayList<>();

        // Valores de raios, incluindo um valor inválido
        double[] raios = {1.0, 2.5, 3.0, 4.5, -5.0};

        // Tentando criar objetos Círculo e tratando exceções individualmente
        for (double raio : raios) {
            try {
                Circulo circulo = new Circulo(raio);
                circulos.add(circulo);
                System.out.printf("Círculo com raio %.2f criado com sucesso. Área: %.2f%n", raio, circulo.calcularArea());
            } catch (IllegalArgumentException e) {
                System.out.printf("Erro ao criar círculo com raio %.2f: %s%n", raio, e.getMessage());
            }
        }
    }
}
