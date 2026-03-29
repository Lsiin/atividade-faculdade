package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plano, meses;
        double valor, total;

        System.out.println("Digite o tipo de plano (1 - Básico, 2 - Intermediário, 3 - Premium): ");
        plano =sc.nextInt();

        System.out.println("Digite a quantidade de meses: ");
        meses = sc.nextInt();

        switch (plano) {
            case 1:
                System.out.println("Plano Básico selecionado.");
                valor = 50.0;
                total = valor * meses;
                System.out.println("Valor total a pagar: " + total);
                break;
            case 2:
                System.out.println("Plano Intermediário selecionado.");
                valor = 80.0;
                total = valor * meses;
                System.out.println("Valor total a pagar: " + total);
                break;
            case 3:
                System.out.println("Plano Premium selecionado.");
                valor = 120.0;
                total = valor * meses;
                System.out.println("Valor total a pagar: " + total);
                break;
            default:
                System.out.println("Plano inválido.");
                break;
        }
        sc.close();
    }
    
}
