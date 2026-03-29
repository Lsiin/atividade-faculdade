package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        int numero;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        if (numero >0 && numero <=10) {
            System.out.println("faixa1");
        
        } else if (numero >10 && numero <=20) {
             System.out.println("faixa2");
         
        } else if (numero >20 && numero <=30) {
           
             System.out.println("faixa3");
         } else {
            System.out.println("fora");
        }
        sc.close();
    }
    
}

