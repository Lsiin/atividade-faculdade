package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            if (sc.nextInt() % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        sc.close();
    }
}
