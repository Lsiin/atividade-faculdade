package listas_de_exercicios.lista2;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
    
    int numero1, numero2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    numero1 = sc.nextInt();
    System.out.println("Digite o segundo número: ");
    numero2 = sc.nextInt();

    if(numero1>numero2){
        System.out.println("o numero"+ numero1+ "é maior que o numero"+numero2);
    } else if(numero2>numero1){
        System.out.println("o numero"+ numero2+ "é maior que o numero"+numero1);
    } else {
        System.out.println("os numeros são iguais");
    }
}
}
