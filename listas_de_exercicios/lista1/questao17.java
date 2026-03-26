package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
           
            int numero1;
            int numero2;

            Scanner sc = new Scanner(System.in);
            System.out.println("digite o primeiro numero");
            numero1= sc.nextInt();
            System.out.println("digite o segundo numero");
            numero2= sc.nextInt();

            int soma = numero1 + numero2;
            int multiplicacao = numero1 * numero2;
            int subtracao = numero1 - numero2;
            int divisao = numero1 / numero2;

            System.out.println("O resultado das operações são:");
            System.out.println("Soma: " + soma);
            System.out.println("Multiplicação: " + multiplicacao);
            System.out.println("Subtração: " + subtracao);
            System.out.println("Divisão: " + divisao);
    
    }

}
