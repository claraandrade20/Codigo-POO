package Pessoa;

public class Principal6 {
	
    public static void main(String[] args) {
    	
        Pessoa mae = new Pessoa("Maria");
        Pessoa pai = new Pessoa("João");
        
        Pessoa filho = new Pessoa("Carlos", pai, mae);
        Pessoa filho2 = new Pessoa("Carlos", pai, mae);

        System.out.println(filho);
        System.out.println(filho2);
        
        System.out.println("Carlos é igual a Carol? " + filho.equals(filho2));
        
        Pessoa mae2 = new Pessoa("Jessica");
        Pessoa filho3 = new Pessoa("Matheus", pai, mae2);
        System.out.println("Carlos é igual ao Mathues com mãe diferente? " + filho.equals(filho3));
    }
}

//Classe Principal6
//Método main: Este é o ponto de entrada do programa.
//Cria objetos Pessoa para a mãe e o pai.
//Cria um objeto Pessoa para um filho chamado Carlos, associando-o aos pais.
//Cria um segundo objeto Pessoa para um filho chamado Carlos com os mesmos pais.
//Imprime os detalhes dos dois objetos Pessoa.
//Compara os dois objetos Carlos e imprime se eles são iguais.
//Cria um novo objeto Pessoa para um filho Matheus com uma mãe diferente e compara com Carlos.
