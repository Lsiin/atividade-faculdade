package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        int reais;
        int dolar=5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser convertido em dolar");
        reais = sc.nextInt();

        double conversao = reais * dolar;
        System.out.println("o valora convertido em dolar é: "+conversao);

    }
    
}
