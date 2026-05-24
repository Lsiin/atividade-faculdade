package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura (ex: 1.50): ");
        double altura = sc.nextDouble();
        System.out.print("Sabe nadar? (s/n): ");
        String nada = sc.next();
        if (altura >= 1.40 && nada.equalsIgnoreCase("s"))
            System.out.println("Entrada permitida no toboágua.");
        else
            System.out.println("Entrada não permitida.");
        sc.close();
    }
}
