 package listas_de_exercicios.lista2;

import java.util.Scanner;

public class questao13 {

   public static void main(String[] args) {
    int salario;
    Scanner sc = new Scanner(System.in);
    System.out.println("salario: ");
    salario = sc.nextInt();
    if(salario>=3000){
        System.out.println("salario alto");
}else{
        System.out.println("salario baixo");}
        sc.close();
 }
}