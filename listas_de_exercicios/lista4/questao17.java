package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double quilometros, centimetros, milimetros;
        int numMetros, escolhaConversao;
        System.out.println("Digite o número em metros: ");
        numMetros = sc.nextInt();
        System.out.println("Escolha a conversão desejada(1: Quilômetros, 2: Centímetros, 3: Milímetros): ");
        escolhaConversao = sc.nextInt();

        switch (escolhaConversao) {
            case 1:
                quilometros = numMetros / 1000.0;
                System.out.printf("O número em quilômetros é: ", quilometros);
                break;
            case 2:
                centimetros = numMetros * 100.0;
                System.out.printf("O número em centímetros é:", centimetros);
                break;
            case 3:
                milimetros = numMetros * 1000.0;
                System.out.printf("O número em milímetros é:", milimetros);
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }
        sc.close();
    }
    
}
