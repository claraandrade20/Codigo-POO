package Circulo;

public class Circulo {
	
    private double raio;
    private Ponto1 centro;

    public Circulo(double raio, Ponto1 centro) {
        this.raio = raio;
        this.centro = centro;
    }

    public Circulo(double raio) {
        this(raio, new Ponto1(0, 0));
    }

    public double getRaio() {
        return raio;
    }

    public void inflar(double valor) {
        if (valor > 0) {
            this.raio += valor;
        }
    }

    public void desinflar(double valor) {
        if (valor > 0 && this.raio - valor >= 0) {
            this.raio -= valor;
        }
    }

    public int area() {
        return (int) Math.round(Math.PI * Math.pow(raio, 2));
    }

    @Override
    public String toString() {
        return "Círculo: Centro(" + centro.getX() + ", " + centro.getY() + "), Raio: " + raio;
    }
}

