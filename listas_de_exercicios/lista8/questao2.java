package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do pedido: ");
        double valor = sc.nextDouble();
        System.out.print("Possui assinatura premium? (s/n): ");
        String premium = sc.next();
        if (valor >= 80 || premium.equalsIgnoreCase("s"))
            System.out.println("Entrega grátis!");
        else
            System.out.println("Entrega cobrada.");
        sc.close();
    }
}
