package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior = Double.MIN_VALUE, menor = Double.MAX_VALUE, soma = 0, altura;
        int qtd = 0;
        do {
            System.out.print("Digite uma altura em metros (0 para sair): ");
            altura = sc.nextDouble();
            if (altura != 0) {
                if (altura > maior) maior = altura;
                if (altura < menor) menor = altura;
                soma += altura;
                qtd++;
            }
        } while (altura != 0);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + (qtd > 0 ? soma / qtd : 0));
        sc.close();
    }
}
