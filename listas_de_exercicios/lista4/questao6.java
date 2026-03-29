package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
       int numero, parImpar;

       Scanner sc = new Scanner(System.in);
       System.out.println("Digite um numero inteiro: ");
       numero = sc.nextInt();
       System.out.println("Digite 1 para verificar se o numero é par ou 2 para verificar se o numero é impar: ");
       parImpar = sc.nextInt();

        switch (parImpar) {
            case 1:
                System.out.println("Verificando se o numero é par... ");
                if (numero % 2 == 0){
                    System.out.println("o numero é par");
                } else
                    System.out.println("o numero não é par");
                break;
            case 2:
                System.out.println("Verificando se o numero é impar... ");
                if (numero % 2 !=0){
                    System.out.println("o numero é impar");    
                } else 
                    System.out.println("o numero não é impar");
                break;
            default:
                System.out.println("Opção inválida");

                break;
        } 
       sc.close();
    }
    }
    

