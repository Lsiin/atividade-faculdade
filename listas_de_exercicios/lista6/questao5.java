package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiores = 0, menores = 0, qtd = 0, somaIdades = 0, idade;
        do {
            System.out.print("Digite uma idade (0 para sair): ");
            idade = sc.nextInt();
            if (idade != 0) {
                qtd++;
                somaIdades += idade;
                if (idade >= 18) maiores++; else menores++;
            }
        } while (idade != 0);
        System.out.println("Maiores de idade: " + maiores);
        System.out.println("Menores de idade: " + menores);
        System.out.println("Média das idades: " + (qtd > 0 ? (double) somaIdades / qtd : 0));
        sc.close();
    }
}
