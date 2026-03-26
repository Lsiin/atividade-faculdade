 package listas_de_exercicios.lista2;

import java.util.Scanner;

public class questao14 {

   public static void main(String[] args) {
    int numero;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    numero = sc.nextInt();
    if(numero >=10 && numero <= 20){
        System.out.println("dentro do intervalo");
}else{
        System.out.println("fora do intervalo");}
 }
}