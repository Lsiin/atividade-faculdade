package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, num;
        do {
            System.out.print("Digite um número (negativo para sair): ");
            num = sc.nextInt();
            if (num >= 0) {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }
        } while (num >= 0);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}
