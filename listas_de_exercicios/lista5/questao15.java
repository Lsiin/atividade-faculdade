package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        
            for (int i = 3; i <= numero; i+=3) {
                System.out.println("numeros multiplos de 3 até o numero digitado: " + i);
            }
            
            sc.close();
        }
}
