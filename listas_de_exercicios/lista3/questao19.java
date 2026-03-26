package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        int pontos;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("quais os pontos? ");
        pontos = sc.nextInt();   
        
        if (pontos >= 100) {
             System.out.println("mestre");
        } else if (pontos >= 50) {
             System.out.println("intermediário");
        } else if (pontos >= 10) {
            System.out.println("iniciante");
        } else {
            System.out.println("novato");
        }
    }
    
}

