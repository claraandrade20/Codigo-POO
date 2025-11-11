package Matriz;

public class Matriz {
	
    private int linhas;
    private int colunas;
    private double[][] dados;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        dados = new double[linhas][colunas];
    }

    public double getElemento(int linha, int coluna) {
        verificarIndices(linha, coluna);
        return dados[linha][coluna];
    }

    public void setElemento(int linha, int coluna, double valor) {
        verificarIndices(linha, coluna);
        dados[linha][coluna] = valor;
    }

    public Matriz adicionar(Matriz outra) {
        verificarDimensoes(outra);
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(i, j, this.getElemento(i, j) + outra.getElemento(i, j));
            }
        }
        return resultado;
    }

    public Matriz subtrair(Matriz outra) {
        verificarDimensoes(outra);
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(i, j, this.getElemento(i, j) - outra.getElemento(i, j));
            }
        }
        return resultado;
    }

    public Matriz multiplicar(Matriz outra) {
        if (this.colunas != outra.linhas) {
            throw new IllegalArgumentException("O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
        }
        Matriz resultado = new Matriz(this.linhas, outra.colunas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < outra.colunas; j++) {
                for (int k = 0; k < this.colunas; k++) {
                    resultado.setElemento(i, j, resultado.getElemento(i, j) + this.getElemento(i, k) * outra.getElemento(k, j));
                }
            }
        }
        return resultado;
    }

    public Matriz transposta() {
        Matriz resultado = new Matriz(colunas, linhas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(j, i, this.getElemento(i, j));
            }
        }
        return resultado;
    }

    public Matriz oposta() {
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(i, j, -this.getElemento(i, j));
            }
        }
        return resultado;
    }

    public static Matriz matrizNula(int linhas, int colunas) {
        return new Matriz(linhas, colunas);
    }

    public boolean isIdentidade() {
        if (linhas != colunas) return false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j && getElemento(i, j) != 1) return false;
                if (i != j && getElemento(i, j) != 0) return false;
            }
        }
        return true;
    }

    public boolean isDiagonal() {
        if (linhas != colunas) return false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j && getElemento(i, j) != 0) return false;
            }
        }
        return true;
    }

    public boolean isSingular() {
        if (!isDiagonal()) return false;
        for (int i = 0; i < linhas; i++) {
            if (getElemento(i, i) == 0) return true;
        }
        return false;
    }

    public boolean isSimetrica() {
        if (linhas != colunas) return false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (getElemento(i, j) != getElemento(j, i)) return false;
            }
        }
        return true;
    }

    public boolean isAntiSimetrica() {
        if (linhas != colunas) return false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (getElemento(i, j) != -getElemento(j, i)) return false;
            }
        }
        return true;
    }

    public Matriz copia() {
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.setElemento(i, j, this.getElemento(i, j));
            }
        }
        return resultado;
    }

    private void verificarDimensoes(Matriz outra) {
        if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
            throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensões.");
        }
    }

    private void verificarIndices(int linha, int coluna) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            throw new IndexOutOfBoundsException("Índices fora dos limites da matriz.");
        }
    }

    public void imprimir() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(dados[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Classe Matriz
//Atributos: linhas, colunas e dados (array bidimensional de double para armazenar os elementos).
//Construtor: Inicializa a matriz com o número de linhas e colunas especificado.
//Métodos:
//getElemento(int linha, int coluna): Retorna o elemento em uma posição específica.
//setElemento(int linha, int coluna, double valor): Define o valor de um elemento em uma posição específica.
//adicionar(Matriz outra): Retorna uma nova matriz que é a soma de duas matrizes.
//subtrair(Matriz outra): Retorna uma nova matriz que é a diferença entre duas matrizes.
//multiplicar(Matriz outra): Retorna uma nova matriz que é o produto de duas matrizes.
//transposta(): Retorna a matriz transposta.
//oposta(): Retorna a matriz oposta (negativa).
//matrizNula(int linhas, int colunas): Cria uma matriz nula com dimensões especificadas.
//Vários métodos para verificar propriedades da matriz, como isIdentidade(), isDiagonal(), isSingular(), isSimetrica(), isAntiSimetrica().
//copia(): Retorna uma cópia da matriz.
//Métodos privados para verificar dimensões e índices.