package Area;

public class Quadrado implements AreaCalculavel {
    private double lado;

    public Quadrado(double lado) throws Exception {
        if (lado <= 0) {
            throw new Exception("O lado do quadrado deve ser maior que zero.");
        }
        this.lado = lado;
    }

    @Override
    public double calculaArea() throws Exception {
        return lado * lado;
    }
}