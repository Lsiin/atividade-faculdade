package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        String nomeProduto;
        double precoProduto;
        double quantidadeProduto;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do produto");
        nomeProduto= sc.nextLine();
        System.out.println("digite o preço do produto");
        precoProduto= sc.nextDouble();
        System.out.println("digite a quantidade do produto");
        quantidadeProduto= sc.nextDouble();
        double totalCompra= precoProduto * quantidadeProduto;
        System.out.println("o total da compra do produto "+nomeProduto+" é: "+totalCompra);
        

    }
}
