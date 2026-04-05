package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiores = 0;
        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite o " + i + "º número: ");
            if (sc.nextInt() > 10) maiores++;
        }
        System.out.println("Maiores que 10: " + maiores);
        sc.close();
    }
}
