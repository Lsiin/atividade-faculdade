package listas_de_exercicios.lista5;

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int media = 0;
        for(int i=1; i<=10; i++){
            System.out.println("Digite um número inteiro: ");
            int numero = sc.nextInt();
            total= (media += numero)/10;
        }
        System.out.println("A média dos números é: " + total);
        sc.close();
    }
}
