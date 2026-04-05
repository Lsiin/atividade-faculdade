package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        for( int i=1; i<=numero; i++){
            System.out.println("numeros até o numero digitado: " + i);
        }
        sc.close();
    }
}
