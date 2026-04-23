package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0, positivos = 0, negativos = 0, num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num != 0) {
                if (num % 2 == 0) pares++; else impares++;
                if (num > 0) positivos++; else negativos++;
            }
        } while (num != 0);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        sc.close();
    }
}
