package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao5 {

    /* Professora, para essa questão considerei um numero redondo para as moedas, assim ficaria mais fácil de fazer:
    Dolar= 5 reais
    Euro=  6 reais
    Libra= 7 reais
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorReais, valorDolar, valorEuro, valorLibra;
        System.out.println("Digite o valor em reais: ");
        valorReais = sc.nextInt();

        int conversao;
        System.out.println("Digite a operacao (1: Reais para Dolar, 2: Reais para Euro, 3: Reais para Libra):");
        conversao = sc.nextInt();

        switch (conversao) {
            case 1: 
                valorDolar = valorReais / 5;
                System.out.println("Valor em Dolar: " + valorDolar);
                break;
            case 2:
                valorEuro= valorReais / 6;
                System.out.println("Valor em Euro: " + valorEuro);
                break;
            case 3:
                valorLibra = valorReais / 7;
                System.out.println("Valor em Libra: " + valorLibra);
                break;
            default:
                break;
        }
        sc.close();
    }
    
}
