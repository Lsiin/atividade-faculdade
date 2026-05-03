package listas_de_exercicios.lista7;

import java.util.Random;

public class questao10 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] v = new int[5];
        int soma = 0;
        for (int i = 0; i < 5; i++) { v[i] = r.nextInt(100) + 1; soma += v[i]; }
        for (int n : v) System.out.println(n);
        System.out.println("Soma: " + soma);
    }
}
