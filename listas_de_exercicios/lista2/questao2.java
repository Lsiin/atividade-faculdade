package listas_de_exercicios.lista2;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if(idade>=18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        sc.close();
    }
}
