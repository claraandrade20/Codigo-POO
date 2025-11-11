package Conta;

public class Bens implements Tributavel {
    private double valor;
    private double taxa;

    public Bens(double valor, double taxa) {
        if (valor < 0 || taxa < 0 || taxa > 1) {
            throw new IllegalArgumentException("Valor ou taxa inválidos. Valor e taxa devem ser positivos, e taxa entre 0 e 1.");
        }
        this.valor = valor;
        this.taxa = taxa;
    }

    @Override
    public double calcularTributo() {
        return valor * taxa;
    }
}