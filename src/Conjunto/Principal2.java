package Conjunto;

public class Principal2 {
	
    public static void main(String[] args) {
    	
        Conjunto conjuntoA = new Conjunto();
        conjuntoA.adicionar("A");
        conjuntoA.adicionar("B");
        conjuntoA.adicionar("C");

        Conjunto conjuntoB = new Conjunto();
        conjuntoB.adicionar("B");
        conjuntoB.adicionar("C");
        conjuntoB.adicionar("D");

        Conjunto uniao = conjuntoA.uniao(conjuntoB);
        System.out.print("União: ");
        uniao.imprimir();

        Conjunto interseccao = conjuntoA.inter(conjuntoB);
        System.out.print("Interseção: ");
        interseccao.imprimir();

        Conjunto subtracao = conjuntoA.menos(conjuntoB);
        System.out.print("Subtração: ");
        subtracao.imprimir();
    }
}
