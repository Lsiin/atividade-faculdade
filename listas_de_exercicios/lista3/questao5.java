package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        String senha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        senha = sc.nextLine();
        if (senha == "admin") {
            System.out.println("acesso total");
        } else if (senha == "user") {
            System.out.println("acesso parcial");
        } else {
            System.out.println("acesso negado");
        }
    }
    
}

