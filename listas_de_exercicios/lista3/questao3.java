package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        double peso;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a peso: ");
        peso = sc.nextDouble();
        if (peso <18.5) {
            System.out.println("abaixo do peso!!");
        } else if (peso <25) {
            System.out.println("peso normal!!");
        } else if (peso <30) {
            System.out.println("sobrepeso!!");
        } else {
            System.out.println("obesidade!!");
        }
        sc.close();
    }
    
}

