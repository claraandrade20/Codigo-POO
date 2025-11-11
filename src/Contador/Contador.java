package Contador;

public class Contador {

	int Valor;
	
	public int getValor() {
		return Valor;
	}

	public void setValor(int Valor) {
		this.Valor = Valor;
	}
	
	public void Zerar() {
		this.Valor = 0;
	}
	
	public void Incrementar() {
		this.Valor++;
	}
	
}

//Classe Contador
//Atributo: Valor (inteiro que armazena o valor do contador).
//Métodos:
//getValor(): Retorna o valor atual do contador.
//setValor(int Valor): Define o valor do contador.
//Zerar(): Reseta o contador para 0.
//Incrementar(): Aumenta o valor do contador em 1.
