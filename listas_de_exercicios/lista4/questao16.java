package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;
        int opcao;
        System.out.println("Digite o peso em kg: ");
        peso = sc.nextDouble();
        System.out.println("Digite a altura em metros: "); 
        altura = sc.nextDouble();
        imc = peso / (Math.pow(altura, 2));
        System.out.println("Escolha o as opções: 1- Mostrar classificação, 2- Mostrar IMC: ");
        opcao = sc.nextInt( );
        switch (opcao) {
            case 1:
                if (imc < 18.5) {
                    System.out.println("Classificação: Abaixo do peso");
                } else if (imc>= 18.5 && imc < 25) {
                    System.out.println("Classificação: Peso normal");
                } else if (imc>= 25 && imc < 30) {
                    System.out.println("Classificação: Sobrepeso");
                }else if (imc>=30 && imc <35) {
                    System.out.println("Classificação: Obesidade grau I");
                } else if (imc>=35 && imc <40) {
                    System.out.println("Classificação: Obesidade grau II");
                } else {
                    System.out.println("Classificação: Obesidade grau III (mórbida)");
                }
                break;
            case 2:
                System.out.printf("Seu IMC é: %.2f%n", imc);
                break;
        
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        sc.close();
    }
}
