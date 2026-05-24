package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo da carteira: ");
        double saldo = sc.nextDouble();
        System.out.print("Possui cupom? (s/n): ");
        String cupom = sc.next();
        if (saldo >= 20 || cupom.equalsIgnoreCase("s"))
            System.out.println("Corrida permitida.");
        else
            System.out.println("Corrida não permitida.");
        sc.close();
    }
}
