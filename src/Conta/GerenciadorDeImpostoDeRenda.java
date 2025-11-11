package Conta;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpostoDeRenda {
    private double totalTributos;
    private List<Tributavel> tributaveis;

    public GerenciadorDeImpostoDeRenda() {
        this.totalTributos = 0.0;
        this.tributaveis = new ArrayList<>();
    }

    public void adicionar(Tributavel tributavel) {
        try {
            tributaveis.add(tributavel);
            totalTributos += tributavel.calcularTributo();
        } catch (Exception e) {
            System.out.println("Erro ao adicionar tributável: " + e.getMessage());
        }
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}