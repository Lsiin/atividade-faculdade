package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas estacionadas: ");
        int horas = sc.nextInt();
        System.out.print("Possui cartão VIP? (s/n): ");
        String vip = sc.next();
        if (horas > 5 || vip.equalsIgnoreCase("s"))
            System.out.println("Desconto aplicado.");
        else
            System.out.println("Sem desconto.");
        sc.close();
    }
}
