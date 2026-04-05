package listas_de_exercicios.lista5;

public class questao22 {
    public static void main(String[] args) {
        int impares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) impares++;
        }
        System.out.println("Números ímpares entre 1 e 100: " + impares);
    }
}
