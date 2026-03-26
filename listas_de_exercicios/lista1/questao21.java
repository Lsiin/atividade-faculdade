package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        double raio;
        Scanner  sc = new Scanner(System.in);
        System.out.println("digite o raio do circulo");
        raio = sc.nextDouble();
        double area= 3.14 * raio * raio;
        System.out.println("a area do circulo é: "+area);
        
    }
    
}
