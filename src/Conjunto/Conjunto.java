package Conjunto;

import java.util.Arrays;

public class Conjunto {
	
    private String[] elementos;
    private int tamanho;

    public Conjunto() {
        elementos = new String[10];
        tamanho = 0;
    }

    public void adicionar(String elemento) {
        if (!pertence(elemento)) {
            if (tamanho == elementos.length) {
                aumentarCapacidade();
            }
            elementos[tamanho++] = elemento;
        }
    }

    public boolean pertence(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < tamanho; i++) {
            resultado.adicionar(elementos[i]);
        }
        for (int i = 0; i < outro.tamanho; i++) {
            resultado.adicionar(outro.elementos[i]);
        }
        return resultado;
    }

    public Conjunto inter(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < tamanho; i++) {
            if (outro.pertence(elementos[i])) {
                resultado.adicionar(elementos[i]);
            }
        }
        return resultado;
    }

    public Conjunto menos(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < tamanho; i++) {
            if (!outro.pertence(elementos[i])) {
                resultado.adicionar(elementos[i]);
            }
        }
        return resultado;
    }

    private void aumentarCapacidade() {
        elementos = Arrays.copyOf(elementos, elementos.length + 10);
    }

    public void imprimir() {
        System.out.print("{ ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}

//Classe Conjunto
//Atributos: elementos (array de strings) e tamanho (número de elementos atualmente no conjunto).
//Construtor: Inicializa o array de elementos com capacidade para 10.
//Métodos:
//adicionar(String elemento): Adiciona um elemento ao conjunto, se ele não estiver presente.
//pertence(String elemento): Verifica se um elemento está presente no conjunto.
//uniao(Conjunto outro): Retorna um novo conjunto que é a união de dois conjuntos.
//inter(Conjunto outro): Retorna um novo conjunto que é a interseção de dois conjuntos.
//menos(Conjunto outro): Retorna um novo conjunto que contém os elementos do primeiro conjunto que não estão no segundo.
//aumentarCapacidade(): Aumenta a capacidade do array de elementos em 10.
//imprimir(): Imprime os elementos do conjunto.