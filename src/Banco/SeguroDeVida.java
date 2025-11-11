package Banco;

public class SeguroDeVida implements Tributavel {
    @Override
    public double calculaTributos() {
        return 42.0; // Taxa fixa de 42 reais
    }

	@Override
	public double calcularTributo() {
		// TODO Auto-generated method stub
		return 0;
	}
}