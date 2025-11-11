package Conta;

public class Rendimento implements Tributavel {
    private double valor;
    private double aliquota;

    public Rendimento(double valor, double aliquota) {
        if (valor < 0 || aliquota < 0 || aliquota > 1) {
            throw new IllegalArgumentException("Valor ou alíquota inválidos. Valor e alíquota devem ser positivos, e alíquota entre 0 e 1.");
        }
        this.valor = valor;
        this.aliquota = aliquota;
    }

    @Override
    public double calcularTributo() {
        return valor * aliquota;
    }
}