package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Senha correta? (s/n): ");
        String senha = sc.next();
        System.out.print("Reconhecimento facial válido? (s/n): ");
        String facial = sc.next();
        if (senha.equalsIgnoreCase("s") || facial.equalsIgnoreCase("s"))
            System.out.println("Acesso permitido.");
        else
            System.out.println("Acesso negado.");
        sc.close();
    }
}
