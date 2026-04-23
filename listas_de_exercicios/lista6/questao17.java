package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;
        do {
            System.out.print("Usuário: ");
            usuario = sc.next();
            System.out.print("Senha: ");
            senha = sc.next();
            if (!usuario.equals("admin") || !senha.equals("1234"))
                System.out.println("Credenciais inválidas. Tente novamente.");
        } while (!usuario.equals("admin") || !senha.equals("1234"));
        System.out.println("Login realizado com sucesso!");
        sc.close();
    }
}
