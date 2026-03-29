package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combustivel, litros;
        double valor, total;

        System.out.println("Digite a quantidade de litros: ");
        litros = sc.nextInt();

        System.out.println("Digite o tipo de combustível (1 - Gasolina, 2 - Etanol, 3 - Diesel): ");
        combustivel = sc.nextInt();

        switch (combustivel) {
            case 1:
                valor = 5.00;
                System.out.println(" O valor da gasolina é: " + valor);
                total = valor * litros;
                System.out.println("Valor total a pagar: " + total);
                break;
            case 2:
                valor = 4.20;
                System.out.println(" O valor do etanol é: " + valor);
                total = valor * litros;
                System.out.println("Valor total a pagar: " + total);
                break;
            case 3:
                valor = 6.10;
                System.out.println(" O valor do diesel é: " + valor);
                total = valor * litros;
                System.out.println("Valor total a pagar: " + total);
                break;

            default:
                System.out.println("Tipo de combustível inválido.");
                break;
        }
        sc.close();
    }

}
