package listas_de_exercicios.lista7;

import java.util.Random;

public class questao8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) v[i] = r.nextInt(50) + 1;
        for (int i = 0; i < 5; i++) System.out.println("Posição " + i + ": " + v[i]);
    }
}
