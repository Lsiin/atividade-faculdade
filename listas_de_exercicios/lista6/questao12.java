package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int homens = 0, mulheres = 0;
        String sexo;
        do {
            System.out.print("Digite M, F ou S para sair: ");
            sexo = sc.next().toUpperCase();
            if (sexo.equals("M")) homens++;
            else if (sexo.equals("F")) mulheres++;
        } while (!sexo.equals("S"));
        System.out.println("Homens: " + homens);
        System.out.println("Mulheres: " + mulheres);
        sc.close();
    }
}
