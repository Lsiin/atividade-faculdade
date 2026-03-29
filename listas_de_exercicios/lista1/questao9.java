package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
         int ano;
     Scanner sc = new Scanner(System.in);
     System.out.println("digite o ano do seu nascimento: ");
     ano= sc.nextInt();

     int idade = 2026 - ano;
     System.out.println("sua idade é: "+idade);

     sc.close();
    }
   
    
}
