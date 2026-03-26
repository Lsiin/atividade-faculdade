package listas_de_exercicios.lista2;
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
    int idade;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua idade: ");
    idade = sc.nextInt();
    if(idade>=16){
        System.out.println("Você pode votar.");
    } else {
        System.out.println("Você não pode votar.");
    }
}
}
