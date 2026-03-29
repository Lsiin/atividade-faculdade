package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        double largura;
        double altura;
        Scanner sc = new Scanner(System.in); 
        System.out.println("digite a largura do retangulo");
        largura= sc.nextDouble();
        System.out.println("digite a altura do retangulo");
        altura= sc.nextDouble();
        double area= largura * altura;
        System.out.println("a area do retangulo é: "+area);
        sc.close();
    }
}
