package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        double valorMetros;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um valor em metros");
        valorMetros = sc.nextDouble();

        double conversaoCentimetros= valorMetros * 100;
        System.out.println("o valor em centimetros é: " + conversaoCentimetros);
    }
}
