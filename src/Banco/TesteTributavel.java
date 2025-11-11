package Banco;

public class TesteTributavel {
    public static void main(String[] args) {
        try {
            ContaCorrente contaCorrente = new ContaCorrente();
            contaCorrente.depositar(1000.0); // Deposita 1000 reais na conta corrente
            System.out.println("Saldo da Conta Corrente: " + contaCorrente.obterSaldo());
            System.out.println("Tributos da Conta Corrente: " + contaCorrente.calculaTributos());

            ContaPoupanca contaPoupanca = new ContaPoupanca();
            contaPoupanca.depositar(2000.0); // Deposita 2000 reais na conta poupança
            System.out.println("Saldo da Conta Poupanca: " + contaPoupanca.obterSaldo());

            SeguroDeVida seguroDeVida = new SeguroDeVida();
            System.out.println("Tributos do Seguro de Vida: " + seguroDeVida.calculaTributos());

            // Tentativa de saque inválida
            contaCorrente.sacar(1500.0); // Lança exceção de saldo insuficiente
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            ContaCorrente contaCorrente = new ContaCorrente();
            // Tentativa de depósito inválida
            contaCorrente.depositar(-500.0); // Lança exceção de valor inválido
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}