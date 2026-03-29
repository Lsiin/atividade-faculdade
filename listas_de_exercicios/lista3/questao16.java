package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        double preco;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("qual o preco? ");
        preco = sc.nextDouble();
        if (preco >=1000) {
            System.out.println("premium");
        
        } else if (preco >=500) {
             System.out.println("intermediário");
         
        } else if (preco >=100) {
           
             System.out.println("básico");
         } else {
            System.out.println("econômico");
        }
        sc.close();
    }
    
}

