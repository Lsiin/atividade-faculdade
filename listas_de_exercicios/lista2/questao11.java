 package listas_de_exercicios.lista2;

import java.util.Scanner;

public class questao11 {

   public static void main(String[] args) {
    int numero;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    numero = sc.nextInt();
    if(numero%3==0){
        System.out.println("numero é múltiplo de 3");
}else{
        System.out.println("numero não é múltiplo de 3");}
        sc.close();
 }
}