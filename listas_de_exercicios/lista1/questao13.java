package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
       double produto;

       Scanner sc = new Scanner(System.in);
       System.out.println("digite o valor do produto");
       produto = sc.nextDouble();
       double valorProduto = produto * 3.0;
         System.out.println("o valor do produto com 3 vezes o valor é: "+valorProduto);
    }
}
