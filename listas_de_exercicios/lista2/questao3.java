package listas_de_exercicios.lista2;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
    int numero;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");    
    numero = sc.nextInt();
    if(numero< 0){
        System.out.println("o numero"+numero+"é negativo");
    } else if(numero>0){
        System.out.println("o numero"+numero+"é positivo");
    } else {
        System.out.println("o numero é zero");
    }
    sc.close();
}
}
