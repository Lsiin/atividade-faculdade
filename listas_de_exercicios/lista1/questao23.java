package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        a = scanner.nextInt();  
        int quadrado= a * a;
        int cubo= a * a * a;
        System.out.println("o quadrado do numero é: "+quadrado);
        System.out.println("o cubo do numero é: "+cubo);

        scanner.close();
    }
    
}
