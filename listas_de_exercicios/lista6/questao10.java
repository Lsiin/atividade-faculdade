package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, nota;
        int qtd = 0;
        do {
            System.out.print("Digite uma nota (0-10) ou -1 para sair: ");
            nota = sc.nextDouble();
            if (nota == -1) break;
            if (nota < 0 || nota > 10) { System.out.println("Nota inválida!"); continue; }
            soma += nota;
            qtd++;
        } while (true);
        System.out.println("Média: " + (qtd > 0 ? soma / qtd : 0));
        sc.close();
    }
}
