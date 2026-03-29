package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double valorCelcius, valorFarenheit, valorKelvin;
    System.out.println("Digite a temperatura em Celcius: ");
    valorCelcius = sc.nextDouble();
    int conversao;
    System.out.println("Digite a operacao (1: Celcius para farenheit, 2: Celcius para kelvin):");
    conversao = sc.nextInt();
    switch (conversao) {
        case 1:
            System.out.println("convertendo para farenheit... " );
                valorFarenheit= (valorCelcius*1.8)+32;
                System.out.println("Valor em Farenheit: " + valorFarenheit);
            break;

        case 2:
            System.out.println("convertendo para kelvin... " );
                valorKelvin= valorCelcius+273.15;
                System.out.println("Valor em Kelvin: " + valorKelvin);
            break;
        default:
            System.out.println("Operacao invalida");
            break;
    }
    sc.close();
}

}
