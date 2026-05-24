package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Apresentou atestado médico? (s/n): ");
        String atestado = sc.next();
        if (idade >= 16 && atestado.equalsIgnoreCase("s"))
            System.out.println("Matrícula realizada.");
        else
            System.out.println("Matrícula não permitida.");
        sc.close();
    }
}
