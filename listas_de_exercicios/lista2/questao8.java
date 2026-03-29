package listas_de_exercicios.lista2;
import java.util.Scanner;

class questao8 {
    public static void main(String[] args) {
   String produto;
   int valor;
   int desconto=10;
   Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do produto: ");
    produto = sc.nextLine();
    System.out.println("Digite o valor do produto: ");
    valor = sc.nextInt();
    if (valor>=100) {
        valor= valor - (valor * desconto/100);
        System.out.println("O valor do produto" + produto + " com desconto é: " + valor);
    }else {
        System.out.println("O valor do produto" + produto + "é: " + valor);
    }
    sc.close();
}
}
