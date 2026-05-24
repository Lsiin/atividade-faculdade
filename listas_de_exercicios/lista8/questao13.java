package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Possui autorização dos responsáveis? (s/n): ");
        String autorizacao = sc.next();
        if (idade >= 18 || autorizacao.equalsIgnoreCase("s"))
            System.out.println("Compra permitida.");
        else
            System.out.println("Compra não permitida.");
        sc.close();
    }
}
