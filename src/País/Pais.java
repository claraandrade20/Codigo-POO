package País;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao; // em Km²
    private List<Pais> fronteiras;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public void adicionarFronteira(Pais pais) {
        if (!fronteiras.contains(pais)) {
            fronteiras.add(pais);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) 
        	return true;
        if (!(obj instanceof Pais)) 
        	return false;
        Pais outro = (Pais) obj;
        return this.codigoISO.equals(outro.codigoISO);
    }

    public double calcularDensidadePopulacional() {
    	if (dimensao == 0) {
    		return 0;
    	}
        return populacao / dimensao;
    }

    @Override
    public String toString() {
        return "País: " + nome + " (Código ISO: " + codigoISO + ")";
    }
}

//Classe Pais
//Atributos:
//codigoISO: Código ISO do país (string).
//nome: Nome do país (string).
//populacao: População do país (long).
//dimensao: Dimensão territorial do país em km² (double).
//fronteiras: Lista de outros países que fazem fronteira com este país (List<Pais>).
//Construtor: Inicializa os atributos codigoISO, nome, e dimensao, e cria uma nova lista para fronteiras.
//Métodos:
//getCodigoISO(): Retorna o código ISO do país.
//setCodigoISO(String codigoISO): Define o código ISO do país.
//getNome(): Retorna o nome do país.
//setNome(String nome): Define o nome do país.
//getPopulacao(): Retorna a população do país.
//setPopulacao(long populacao): Define a população do país.
//getDimensao(): Retorna a dimensão do país.
//setDimensao(double dimensao): Define a dimensão do país.
//adicionarFronteira(Pais pais): Adiciona um país à lista de fronteiras, se não estiver já presente.
//equals(Object obj): Sobrescreve o método equals para comparar países com base no código ISO.
//calcularDensidadePopulacional(): Calcula e retorna a densidade populacional (população por unidade de área); se a dimensão for zero, retorna 0.
//toString(): Retorna uma representação em string do país, incluindo o nome e o código ISO.