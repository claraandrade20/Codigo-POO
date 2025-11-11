package Area;

public class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) throws Exception {
        if (base <= 0 || altura <= 0) {
            throw new Exception("A base e a altura do retângulo devem ser maiores que zero.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() throws Exception {
        return base * altura;
    }
}