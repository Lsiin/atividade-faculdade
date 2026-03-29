package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao15 {
        
    public static void main(String[] args) {
        int valorQuilometros;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um valor em quilometros");
        valorQuilometros = sc.nextInt();

        int conversaoCentimetros= valorQuilometros * 1000;
        System.out.println("o valor em centimetros é: " + conversaoCentimetros);
        sc.close();
    }
    
}