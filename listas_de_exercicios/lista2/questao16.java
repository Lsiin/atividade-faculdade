 package listas_de_exercicios.lista2;

import java.util.Scanner;

public class questao16 {

   public static void main(String[] args) {
    int numero;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    numero = sc.nextInt();
    if(numero >=0){
        System.out.println("não negativo");
}else{
        System.out.println("negativo");}
 }
}