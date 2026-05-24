package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Possui documento? (s/n): ");
        String doc = sc.next();
        if (idade >= 18 && doc.equalsIgnoreCase("s"))
            System.out.println("Reserva realizada com sucesso.");
        else
            System.out.println("Reserva não permitida.");
        sc.close();
    }
}
