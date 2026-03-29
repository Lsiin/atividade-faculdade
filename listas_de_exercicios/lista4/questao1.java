package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {

    int numero1, numero2, operacao;
    Scanner sc= new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    numero1 = sc.nextInt();
    System.out.println("Digite o segundo numero: ");
    numero2 = sc.nextInt();
    System.out.println("Escolha a operacao: 1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao");
    operacao = sc.nextInt();
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
    switch (operacao) {
        case 1:
            System.out.println("Soma: " + soma);
            break;
        case 2:
            System.out.println("Subtracao: " + subtracao);
            break;
        case 3:
            System.out.println("Multiplicacao: " + multiplicacao);
            break;
        case 4:
            System.out.println("Divisao: " + divisao);
            break;
        default:
            System.out.println("Operacao invalida");

            break;
    }
    sc.close();
    }
}
