package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num >= 1 && num <= 25) f1++;
            else if (num >= 26 && num <= 50) f2++;
            else if (num >= 51 && num <= 75) f3++;
            else if (num >= 76 && num <= 100) f4++;
        } while (num != 0);
        System.out.println("0-25: " + f1);
        System.out.println("26-50: " + f2);
        System.out.println("51-75: " + f3);
        System.out.println("76-100: " + f4);
        sc.close();
    }
}
