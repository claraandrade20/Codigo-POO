package Pessoa;

public class Pessoa {
	
    private String nome;  
    private Pessoa pai;   
    private Pessoa mae;    

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this(nome, null, null);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Pessoa pessoa = (Pessoa) obj; 
        return nome.equals(pessoa.nome) && ((mae == null && pessoa.mae == null) || (mae != null && mae.equals(pessoa.mae)));
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", pai=" + (pai != null ? pai.nome : "null") +
                ", mae=" + (mae != null ? mae.nome : "null") +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }
}

//Classe Pessoa
//Atributos:
//nome: Nome da pessoa (string).
//pai: Referência para o pai (objeto da classe Pessoa).
//mae: Referência para a mãe (objeto da classe Pessoa).

//Construtores:
//Pessoa(String nome, Pessoa pai, Pessoa mae): Inicializa a pessoa com nome, pai e mãe.
//Pessoa(String nome): Inicializa a pessoa apenas com nome, pai e mãe são null.
//Métodos:

//equals(Object obj): Sobrescreve o método equals para comparar duas pessoas com base no nome e na mãe.
//toString(): Retorna uma representação em string da pessoa, incluindo o nome, pai e mãe.
//getNome(): Retorna o nome da pessoa.
//getPai(): Retorna o pai da pessoa.
//getMae(): Retorna a mãe da pessoa.
//Comentários para Principal6
