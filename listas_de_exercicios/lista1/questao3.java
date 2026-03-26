package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        int a;
        int b;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("digite um numero");
        a= sc.nextInt();
        System.out.println("digite outro numero");
        b= sc.nextInt();
        int resultado= a + b;
        System.out.println("a soma dos numeros é: "+resultado);
    }

    
}
