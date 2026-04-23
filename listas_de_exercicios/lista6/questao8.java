package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num != 0 && num % 3 == 0) count++;
        } while (num != 0);
        System.out.println("Múltiplos de 3: " + count);
        sc.close();
    }
}
