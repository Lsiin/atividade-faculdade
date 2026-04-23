package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaPares = 0, somaImpares = 0, num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num != 0) {
                if (num % 2 == 0) somaPares += num; else somaImpares += num;
            }
        } while (num != 0);
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);
        sc.close();
    }
}
