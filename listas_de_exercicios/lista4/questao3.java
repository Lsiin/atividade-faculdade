package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
      int valor, tipoCliente;
      double desconto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        valor = sc.nextInt();
        System.out.println("Digite o tipo de cliente (1 - Comum, 2 - Premium, 3 - vip): ");
        tipoCliente = sc.nextInt();

        switch (tipoCliente) {
            case 1:
                double clienteComum = (valor * 5)/100;
                System.out.println("Valor do desconto para cliente comum: " + clienteComum);
                desconto = valor - clienteComum;
                System.out.println("Valor total a pagar: " + String.format("%.2f", desconto));
                break;
            case 2:
                double clientePremium = (valor * 10)/100;
                System.out.println("Valor do desconto para cliente premium: " + clientePremium);
                desconto = valor - clientePremium;
                System.out.println("Valor total a pagar: " + String.format("%.2f", desconto));
                break;
            case 3:
                double clienteVip = (valor * 15)/100;
                System.out.println("Valor do desconto para cliente vip: " + clienteVip);
                desconto = valor - clienteVip;
                System.out.println("Valor total a pagar: " + String.format("%.2f", desconto ));
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                break;
        }

        sc.close();

    }
}
