package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        double nota;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        nota = sc.nextDouble();
        if (nota>=9) {
            
            System.out.println("A");
        
        } else if (nota >=7) {
        
             System.out.println("B");
         
        } else if (nota >=5) {
           
             System.out.println("C");
         } else {
            System.out.println("D");
        }
    }
    
}

