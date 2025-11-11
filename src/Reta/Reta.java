package Reta;

public class Reta {
	private double a; // Coeficiente angular
    private double b; // Coeficiente linear

    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Reta(Ponto8 p1, Ponto8 p2) {
        if (p1.getX() == p2.getX()) {
            throw new IllegalArgumentException("Os pontos não podem ter a mesma coordenada x (reta vertical).");
        }
        this.a = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        this.b = p1.getY() - this.a * p1.getX();
    }

    public double getCoeficienteAngular() {
        return a;
    }

    public double getCoeficienteLinear() {
        return b;
    }

    public boolean pontoPertence(Ponto8 p) {
        return p.getY() == a * p.getX() + b;
    }

    public Ponto8 pontoInterseccao(Reta outra) {
        if (this.a == outra.a) {
            return null;
        }
        double x = (outra.b - this.b) / (this.a - outra.a);
        double y = this.a * x + this.b;
        return new Ponto8(x, y);
    }
    
    @Override
    public String toString() {
        return "Reta: y = " + a + "x + " + b;
    }
}

//Classe Reta
//Atributos:
//a: Coeficiente angular (inclinação) da reta (double).
//b: Coeficiente linear (interseção y) da reta (double).

//Construtores:
//Reta(double a, double b): Inicializa a reta com os coeficientes angular e linear fornecidos.
//Reta(Ponto8 p1, Ponto8 p2): Inicializa a reta a partir de dois pontos. Calcula o coeficiente angular e linear. Lança uma exceção se os pontos têm a mesma coordenada x (reta vertical).

//Métodos:
//getCoeficienteAngular(): Retorna o coeficiente angular da reta.
//getCoeficienteLinear(): Retorna o coeficiente linear da reta.
//pontoPertence(Ponto8 p): Verifica se um ponto pertence à reta, retornando true ou false.
//pontoInterseccao(Reta outra): Calcula o ponto de interseção entre a reta atual e outra reta. Retorna null se as retas são paralelas.
//toString(): Retorna uma representação em string da reta no formato y = ax + b.

