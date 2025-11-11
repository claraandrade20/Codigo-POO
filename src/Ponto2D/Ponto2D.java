package Ponto2D;

public class Ponto2D {
	
    private double x; 
    private double y; 

    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D outro) {
        this.x = outro.x;
        this.y = outro.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Ponto2D outro) {
        return Math.sqrt(Math.pow(this.x - outro.x, 2) + Math.pow(this.y - outro.y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Ponto2D ponto = (Ponto2D) obj;
        return Double.compare(ponto.x, x) == 0 && Double.compare(ponto.y, y) == 0; 
        }

    @Override
    public String toString() {
        return "Ponto2D(" + x + ", " + y + ")";
    }
}

//Classe Ponto2D
//Atributos:
//x: Coordenada x do ponto (double).
//y: Coordenada y do ponto (double).

//Construtores:
//Ponto2D(): Inicializa o ponto na origem (0.0, 0.0).
//Ponto2D(double x, double y): Inicializa o ponto com as coordenadas fornecidas.
//Ponto2D(Ponto2D outro): Inicializa um novo ponto como uma cópia de outro ponto.

//Métodos:
//getX(): Retorna a coordenada x do ponto.
//getY(): Retorna a coordenada y do ponto.
//setX(double x): Define a coordenada x do ponto.
//setY(double y): Define a coordenada y do ponto.
//distancia(Ponto2D outro): Calcula a distância entre este ponto e outro ponto usando a fórmula da distância euclidiana.
//equals(Object obj): Sobrescreve o método equals para comparar dois pontos com base nas suas coordenadas.
//toString(): Retorna uma representação em string do ponto.
