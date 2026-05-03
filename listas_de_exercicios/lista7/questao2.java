package listas_de_exercicios.lista7;

import java.util.Random;

public class questao2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) v[i] = r.nextInt(10) + 1;
        for (int n : v) System.out.println(n);
    }
}
