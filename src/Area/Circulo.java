package Area;

public class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) throws Exception {
        if (raio <= 0) {
            throw new Exception("O raio do círculo deve ser maior que zero.");
        }
        this.raio = raio;
    }

    @Override
    public double calculaArea() throws Exception {
        return Math.PI * raio * raio;
    }
}