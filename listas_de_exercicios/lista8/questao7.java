package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Possui perfil infantil? (s/n): ");
        String infantil = sc.next();
        if (idade >= 18 && !infantil.equalsIgnoreCase("s"))
            System.out.println("Acesso ao conteúdo adulto permitido.");
        else
            System.out.println("Acesso não permitido.");
        sc.close();
    }
}
