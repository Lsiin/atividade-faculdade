package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, preco;
        int qtd = 0;
        do {
            System.out.print("Digite o preço (0 para sair): ");
            preco = sc.nextDouble();
            if (preco != 0) { total += preco; qtd++; }
        } while (preco != 0);
        System.out.println("Total: R$ " + total);
        System.out.println("Quantidade: " + qtd);
        System.out.println("Média: R$ " + (qtd > 0 ? total / qtd : 0));
        sc.close();
    }
}
