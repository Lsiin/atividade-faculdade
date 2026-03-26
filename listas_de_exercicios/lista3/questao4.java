package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        double numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a numero: ");
        numero = sc.nextDouble();
        if (numero >0) {
            System.out.println("positivo");
        } else if (numero == 0) {
            System.out.println("zero");
    
        } else {
            System.out.println("negativo");
        }
    }
    
}

