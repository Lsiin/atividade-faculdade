package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        int prato, quantidade;
        double valor, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o prato: 1 - Pizza, 2 - Hamburguer, 3 - Salada: ");
        prato = sc.nextInt();

        switch (prato) {
            case 1:
                valor = 35.00;
                System.out.println("pizza? boa escolha! o valor da pizza é: " + valor);
                System.out.println("Digite a quantidade de pizzas: ");
                quantidade = sc.nextInt();
                total = valor * quantidade;
                System.out.println("Valor total a pagar: " + total);
                break;
            case 2:
                valor = 25.00;
                System.out.println("hamburguer? Que gostoso!! o valor do hamburguer é: " + valor);
                System.out.println("Digite a quantidade de hamburgueres: ");
                quantidade = sc.nextInt();
                total = valor * quantidade;
                System.out.println("Valor total a pagar: " + total);
                break;
            case 3:
                valor = 18.00;
                System.out.println("salada? Saudável! o valor da salada é: " + valor);
                System.out.println("Digite a quantidade de saladas: ");
                quantidade = sc.nextInt();
                total = valor * quantidade;
                System.out.println("Valor total a pagar: " + total);
                break;
            default:
                System.out.println("Não temos esse pedido");
                break;
        }
        sc.close();
    }
    
}
