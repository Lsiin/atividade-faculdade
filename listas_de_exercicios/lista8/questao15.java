package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intensidade do sol (%): ");
        double sol = sc.nextDouble();
        System.out.print("Nível da bateria (%): ");
        double bateria = sc.nextDouble();
        if (sol > 70 && bateria < 90)
            System.out.println("Carregamento ativado.");
        else
            System.out.println("Carregamento não ativado.");
        sc.close();
    }
}
