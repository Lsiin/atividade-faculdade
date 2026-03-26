 package listas_de_exercicios.lista2;


import java.util.Scanner;

public class questao17 {

   public static void main(String[] args) {
    int numeros;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero de 1 a 7: ");
    numeros = sc.nextInt();
    if(numeros <1 || numeros >7){
        System.out.println("numero invalido, digite um numero de 1 a 7");
}else if(numeros >=5){
        System.out.println("final de semana");
 }else{
        System.out.println("dia de semana");}
 }

}