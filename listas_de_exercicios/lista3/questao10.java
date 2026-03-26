package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a numero: ");
        numero = sc.nextInt();
        if (numero% 2==0) {
            
            System.out.println("multiplo de 2");
        } else if (numero % 3==0) {
    
             System.out.println("multiplo de 3!!");
         
        } else {
            System.out.println("outro");
        }
    }
    
}

