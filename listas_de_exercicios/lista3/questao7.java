package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a valor: ");
        valor = sc.nextInt();
        if (valor >=500) {
            valor = valor - ( valor *20 /100);
            System.out.println(valor);
        } else if (valor >=200) {
             valor = valor - ( valor *20 /100);
             System.out.println(valor);
        } else if (valor >=100) {
             valor = valor - ( valor *5 /100);
            System.out.println(valor);
        } else {
            System.out.println("sem desconto!!");
        }
        sc.close();
    }
    
}

