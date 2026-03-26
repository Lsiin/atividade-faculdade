package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
    Scanner sc = new Scanner(System.in);
    System.out.println("digite o primeiro numero");
    a= sc.nextInt();
    System.out.println("digite o segundo numero");
    b= sc.nextInt();
    System.out.println("digite o terceiro numero");
    c= sc.nextInt();

    int resultado= a + b + c;
    System.out.println("a soma dos numeros é: "+resultado);
    }
}
