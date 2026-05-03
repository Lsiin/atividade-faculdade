package listas_de_exercicios.lista7;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        for (int i = 4; i >= 0; i--) System.out.println(v[i]);
        sc.close();
    }
}
