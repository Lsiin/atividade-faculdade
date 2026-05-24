package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Livros atrasados: ");
        int atrasados = sc.nextInt();
        System.out.print("Matrícula ativa? (s/n): ");
        String ativa = sc.next();
        if (atrasados == 0 && ativa.equalsIgnoreCase("s"))
            System.out.println("Empréstimo permitido.");
        else
            System.out.println("Empréstimo não permitido.");
        sc.close();
    }
}
