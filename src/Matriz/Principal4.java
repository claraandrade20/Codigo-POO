package Matriz;

public class Principal4 {
	
	public static void main(String[] args) {
		
        Matriz matrizA = new Matriz(3, 3);
        matrizA.setElemento(0, 0, 1);
        matrizA.setElemento(0, 1, 2);
        matrizA.setElemento(0, 2, 3);
        matrizA.setElemento(1, 0, 0);
        matrizA.setElemento(1, 1, 1);
        matrizA.setElemento(1, 2, 0);
        matrizA.setElemento(2, 0, 4);
        matrizA.setElemento(2, 1, 5);
        matrizA.setElemento(2, 2, 6);

        Matriz matrizB = new Matriz(3, 3);
        matrizB.setElemento(0, 0, 7);
        matrizB.setElemento(0, 1, 8);
        matrizB.setElemento(0, 2, 9);
        matrizB.setElemento(1, 0, 0);
        matrizB.setElemento(1, 1, 1);
        matrizB.setElemento(1, 2, 0);
        matrizB.setElemento(2, 0, 10);
        matrizB.setElemento(2, 1, 11);
        matrizB.setElemento(2, 2, 12);

        Matriz soma = matrizA.adicionar(matrizB);
        Matriz subtracao = matrizA.subtrair(matrizB);
        Matriz multiplicacao = matrizA.multiplicar(matrizB);
        Matriz transposta = matrizA.transposta();
        Matriz oposta = matrizA.oposta();
        Matriz copia = matrizA.copia();

        System.out.println("Matriz A:");
        matrizA.imprimir();
        
        System.out.println("Matriz B:");
        matrizB.imprimir();
        
        System.out.println("Soma das Matrizes A e B:");
        soma.imprimir();
        
        System.out.println("Subtração de A por B:");
        subtracao.imprimir();
        
        System.out.println("Multiplicação de A por B:");
        multiplicacao.imprimir();
        
        System.out.println("Transposta de A:");
        transposta.imprimir();
        
        System.out.println("Oposta de A:");
        oposta.imprimir();
        
        System.out.println("Cópia de A:");
        copia.imprimir();
        
        System.out.println("A matriz A é identidade? " + matrizA.isIdentidade());
        System.out.println("A matriz A é diagonal? " + matrizA.isDiagonal());
        System.out.println("A matriz A é singular? " + matrizA.isSingular());
        System.out.println("A matriz A é simétrica? " + matrizA.isSimetrica());
        System.out.println("A matriz A é anti-simétrica? " + matrizA.isAntiSimetrica());
    }
}