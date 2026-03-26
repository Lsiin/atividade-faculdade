package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite as medidas dos 3 lados separadas por espaço (ex: 5 5 5): ");
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();
        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("isósceles");
        } else {
            System.out.println("escaleno");
        }
        
        sc.close();
    }
}
