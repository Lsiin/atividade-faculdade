package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        int nota;
        int frequencia;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a nota? ");
        nota = sc.nextInt();   
        System.out.println("qual a frequencia? ");
        frequencia = sc.nextInt();
        if (frequencia <75){
                System.out.println("reprovado por falta");
        } else if (nota >= 7 && frequencia >= 75) {
             System.out.println("aprovado");
        } else if (nota >=5) {
             System.out.println("recuperação");
        } else {
            System.out.println("reprovado");
        }
        sc.close();
    }
    
}

