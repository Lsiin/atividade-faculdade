package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Possui internet? (s/n): ");
        String internet = sc.next();
        System.out.print("Possui músicas baixadas? (s/n): ");
        String baixadas = sc.next();
        if (internet.equalsIgnoreCase("s") || baixadas.equalsIgnoreCase("s"))
            System.out.println("Pode ouvir música.");
        else
            System.out.println("Não é possível ouvir música.");
        sc.close();
    }
}
