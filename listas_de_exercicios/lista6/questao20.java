package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n1-Somar | 2-Subtrair | 3-Multiplicar | 4-Dividir | 5-Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Número 1: ");
                double a = sc.nextDouble();
                System.out.print("Número 2: ");
                double b = sc.nextDouble();
                if (opcao == 1) System.out.println("Resultado: " + (a + b));
                else if (opcao == 2) System.out.println("Resultado: " + (a - b));
                else if (opcao == 3) System.out.println("Resultado: " + (a * b));
                else if (b != 0) System.out.println("Resultado: " + (a / b));
                else System.out.println("Divisão por zero!");
            }
        } while (opcao != 5);
        sc.close();
    }
}
