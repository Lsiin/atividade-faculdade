package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            num = sc.nextInt();
        } while (num <= 0);
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + (num * i));
        sc.close();
    }
}
