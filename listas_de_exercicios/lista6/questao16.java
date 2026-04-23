package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, count = 0, num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num != 0 && num % 5 == 0) { soma += num; count++; }
        } while (num != 0);
        System.out.println("Soma dos múltiplos de 5: " + soma);
        System.out.println("Quantidade: " + count);
        sc.close();
    }
}
