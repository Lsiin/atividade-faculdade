package listas_de_exercicios.lista7;

import java.util.Random;

public class questao4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) v[i] = r.nextInt(100) + 1;
        System.out.println("Último elemento: " + v[4]);
    }
}
