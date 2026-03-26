 package listas_de_exercicios.lista2;

import java.util.Scanner;

public class questao12 {

   public static void main(String[] args) {
    int senha;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a senha: ");
    senha = sc.nextInt();
    if(senha==1234){
        System.out.println("senha correta");
}else{
        System.out.println("senha incorreta");}
 }
}