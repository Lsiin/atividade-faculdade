package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a sua idade");
        idade = sc.nextInt();
        int meses = idade * 12;
        System.out.println("sua idade em meses é: "+meses);
        sc.close();
    }
    
}
