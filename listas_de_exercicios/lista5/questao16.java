package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println("a soma dos numeros até 10:");
            System.out.println(numero + " + " + i + " = " + (numero + i));
        }
        sc.close();
    }
}
