 package listas_de_exercicios.lista2;

import java.util.Scanner;

public class questao15 {

   public static void main(String[] args) {
    int nota;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um nota: ");
    nota = sc.nextInt();
    if(nota >=7){
        System.out.println("aprovado");
}else{
        System.out.println("em recuperação");}
 }
}