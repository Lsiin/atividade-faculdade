package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Está usando jaleco? (s/n): ");
        String jaleco = sc.next();
        System.out.print("Está usando crachá? (s/n): ");
        String cracha = sc.next();
        if (jaleco.equalsIgnoreCase("s") && cracha.equalsIgnoreCase("s"))
            System.out.println("Entrada permitida.");
        else
            System.out.println("Entrada não permitida.");
        sc.close();
    }
}
