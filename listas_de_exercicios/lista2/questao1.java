package listas_de_exercicios.lista2;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        numero= sc.nextInt();
        if(numero % 2 ==0){
            System.out.println("o numero é par");
        }else{
            System.out.println("o numero é impar");
        }
        sc.close();
    }
}