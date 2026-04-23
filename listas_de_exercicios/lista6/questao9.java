package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorPar = Integer.MIN_VALUE, menorImpar = Integer.MAX_VALUE, num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num != 0) {
                if (num % 2 == 0 && num > maiorPar) maiorPar = num;
                if (num % 2 != 0 && num < menorImpar) menorImpar = num;
            }
        } while (num != 0);
        System.out.println("Maior par: " + (maiorPar == Integer.MIN_VALUE ? "nenhum" : maiorPar));
        System.out.println("Menor ímpar: " + (menorImpar == Integer.MAX_VALUE ? "nenhum" : menorImpar));
        sc.close();
    }
}
