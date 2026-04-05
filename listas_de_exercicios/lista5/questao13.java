package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                     System.out.println("Numeros pares até o numero digitado: " + i);
                }
               
            }
        sc.close();
    }
}
