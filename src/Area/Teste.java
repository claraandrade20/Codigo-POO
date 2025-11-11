package Area;

public class Teste {
    public static void main(String[] args) {
        AreaCalculavel[] formas = new AreaCalculavel[5];

        try {
            formas[0] = new Quadrado(4);
            formas[1] = new Retangulo(3, 6);
            formas[2] = new Circulo(5);
            formas[3] = new Quadrado(-7);  // Lançará uma exceção
            formas[4] = new Retangulo(2, 8);
        } catch (Exception e) {
            System.out.println("Erro ao criar a forma: " + e.getMessage());
        }

        for (AreaCalculavel forma : formas) {
            if (forma != null) {
                try {
                    System.out.println("Área: " + forma.calculaArea());
                } catch (Exception e) {
                    System.out.println("Erro ao calcular a área: " + e.getMessage());
                }
            }
        }
    }
}