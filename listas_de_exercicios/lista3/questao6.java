package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        int temperatura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        temperatura = sc.nextInt();
        if (temperatura >=35) {
            System.out.println("Muito quente!!");
        } else if (temperatura >=25) {
            System.out.println("quente!!");
        } else if (temperatura >=15) { 
            System.out.println("agradável!!");
        } else {
            System.out.println("frio!!");
        }
        sc.close();
    }
    
}

