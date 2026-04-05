package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        for( int i=numero; i>=1; i--){
            System.out.println("numeros até o numero digitado: " + i);
        }
    
        sc.close();
    }
}
