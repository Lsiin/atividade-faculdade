package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorCompra, regiao, total;
        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextInt();
        System.out.println("Digite a região de destino (1 - Norte, 2 - Sul, 3 -Nordeste): ");
        regiao = sc.nextInt();

        switch (regiao) {
            case 1:
                System.out.println("calculando o frete para a região norte...");
                total = valorCompra + 20;
                System.out.println("Valor total a pagar: " + total);         
                break;
            case 2: 
                System.out.println("calculando o frete para a região sul...");
                total = valorCompra + 10;
                System.out.println("Valor total a pagar: " + total);
                break;
            case 3:
                System.out.println("calculando o frete para a região nordeste...");
                total = valorCompra + 15;
                System.out.println("Valor total a pagar: " + total);
                break;
            default:
                System.out.println("Região inválida.");
                break;
        }
        sc.close();
    }
    
}
