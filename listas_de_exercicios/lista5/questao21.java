package listas_de_exercicios.lista5;

public class questao21 {
    public static void main(String[] args) {
        int pares = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) pares++;
        }
        System.out.println("Números pares entre 1 e 50: " + pares);
    }
}
