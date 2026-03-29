package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        double altura;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("qual o altura? ");
        altura = sc.nextDouble();   
        
        if (altura < 1.50) {
             System.out.println(" pessoa é baixa");
        } else if (altura >= 1.70) {
             System.out.println(" pessoa é média");
        } else {
            System.out.println("pessoa é alta");
        }
        sc.close();
    }
    
}

