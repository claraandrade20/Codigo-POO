package Banco;


public class ContaCorrente extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return saldo * 0.01; // 1% do saldo
    }

	@Override
	public double calcularTributo() {
		// TODO Auto-generated method stub
		return 0;
	}
}