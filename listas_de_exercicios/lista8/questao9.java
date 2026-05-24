package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nível do jogador: ");
        int nivel = sc.nextInt();
        System.out.print("Quantidade de moedas: ");
        int moedas = sc.nextInt();
        if (nivel >= 10 && moedas >= 500)
            System.out.println("Item especial desbloqueado!");
        else
            System.out.println("Não foi possível desbloquear o item.");
        sc.close();
    }
}
