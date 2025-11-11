package Banco;

public abstract class Conta {
    protected double saldo;

    public void sacar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor de saque inválido. O valor deve ser maior que zero.");
        }
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    public void depositar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor de depósito inválido. O valor deve ser maior que zero.");
        }
        saldo += valor;
    }

    public double obterSaldo() {
        return saldo;
    }
}