package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("tabuada do numero:" + numero + "X" + i + "=" + (numero * i));
        }

        sc.close();
    }
}
