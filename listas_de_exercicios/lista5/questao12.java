package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numero2;
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        numero2 = sc.nextInt();
        for (int i = numero; i <= numero2; i++) {
            System.out.println("numeros entre o numero digitado: " + i);
        }
        sc.close();
    }
}
