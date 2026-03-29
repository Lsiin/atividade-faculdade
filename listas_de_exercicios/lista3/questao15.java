package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
       int multaVelocidade;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a velocidade? ");
        multaVelocidade = sc.nextInt();
        if (multaVelocidade >120) {
            System.out.println("multa grave");
        
        } else if (multaVelocidade >80 && multaVelocidade <=120) {
             System.out.println("multa leve");
         
        } else if (multaVelocidade >60 && multaVelocidade <=80) {
           
             System.out.println("atenção");
         } else {
            System.out.println("normal");
        }
        sc.close();
    }
    
}

