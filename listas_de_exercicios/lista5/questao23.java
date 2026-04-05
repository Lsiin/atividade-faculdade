package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            if (sc.nextInt() > 0) positivos++;
        }
        System.out.println("Positivos: " + positivos);
        sc.close();
    }
}
