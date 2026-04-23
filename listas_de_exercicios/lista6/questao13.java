package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaPares = 0, somaImpares = 0, qtdPares = 0, qtdImpares = 0, num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num != 0) {
                if (num % 2 == 0) { somaPares += num; qtdPares++; }
                else { somaImpares += num; qtdImpares++; }
            }
        } while (num != 0);
        System.out.println("Média dos pares: " + (qtdPares > 0 ? (double) somaPares / qtdPares : 0));
        System.out.println("Média dos ímpares: " + (qtdImpares > 0 ? (double) somaImpares / qtdImpares : 0));
        sc.close();
    }
}
