package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for(int i=1; i<=5; i++){
            System.out.println("Digite um número inteiro: ");
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("a soma dos numeros é:"+ soma);
        sc.close();
    }
}
