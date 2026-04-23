package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int opcao;
        do {
            System.out.println("\n1 - Depositar | 2 - Sacar | 3 - Ver saldo | 4 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.print("Valor para depositar: ");
                saldo += sc.nextDouble();
            } else if (opcao == 2) {
                System.out.print("Valor para sacar: ");
                double v = sc.nextDouble();
                if (v <= saldo) saldo -= v; else System.out.println("Saldo insuficiente.");
            } else if (opcao == 3) {
                System.out.println("Saldo: R$ " + saldo);
            }
        } while (opcao != 4);
        sc.close();
    }
}
