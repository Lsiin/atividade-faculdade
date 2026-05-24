package listas_de_exercicios.lista8;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade do vento (km/h): ");
        double vento = sc.nextDouble();
        System.out.print("Nível da bateria (%): ");
        double bateria = sc.nextDouble();
        if (vento < 40 && bateria > 50)
            System.out.println("Voo permitido.");
        else
            System.out.println("Voo não permitido.");
        sc.close();
    }
}
