package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args){
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        a= sc.nextInt();

        int antes= a - 1;
        int depois= a + 1;
        System.out.println("o seu antecessor é: "+antes+" e o seu sucessor é  "+depois);

    }
    
}
