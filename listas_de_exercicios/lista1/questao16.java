package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        double salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o salario do funcionario");
        salario= sc.nextDouble();

        double salarioAnual= salario * 12;
        System.out.println("o salario anual do funcionario é: "+salarioAnual);
        sc.close();
    }
}
