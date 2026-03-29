package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome");
        nome= sc.nextLine();

        System.out.println("olá "+nome+"! Seja bem-vindo à programação");
        
        sc.close();
    }
}
