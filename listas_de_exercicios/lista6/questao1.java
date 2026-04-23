package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, qtd = 0, num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num != 0) { soma += num; qtd++; }
        } while (num != 0);
        System.out.println("Soma: " + soma);
        System.out.println("Quantidade: " + qtd);
        System.out.println("Média: " + (qtd > 0 ? (double) soma / qtd : 0));
        sc.close();
    }
}
