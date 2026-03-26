package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
        if (idade <12) {
            
            System.out.println("infantil!!");
        } else if (idade <18) {
    
             System.out.println("juvenil!!");
         } else if (idade <60) {
            System.out.println("adulto!!");
        } else {
            System.out.println("melhor idade!!");
        }
    }
    
}

