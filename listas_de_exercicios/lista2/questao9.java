package listas_de_exercicios.lista2;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
    int numero;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    numero = sc.nextInt();
    if(numero==10){
        System.out.println("o numero é especial");
    }else{
        System.out.println("o numero é comum");}
        sc.close();
    }
}
