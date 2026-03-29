package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
    double nota1, nota2;
    int escolha;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a primeira nota: ");
    nota1 = sc.nextDouble();  
    System.out.println("Digite a segunda nota: ");
    nota2 = sc.nextDouble(); 

    System.out.println("Escolha a operacao: 1 - Media simples, 2 - Media Ponderada");
    escolha = sc.nextInt();
    switch (escolha) {
        case 1:
            System.out.println("Calculando a media");
            double mediaSimples = (nota1 + nota2) / 2;
            System.out.println("Media Simples: " + mediaSimples);
            break;
        case 2:
            System.out.println("Calculando a media ponderada");
            double mediaPonderada = ((nota1 * 2) + (nota2 * 3))/(2+3);
            System.out.println("Media Ponderada: " + mediaPonderada);
            break;
        default:
            System.out.println("Opcao invalida");
            break;
    }
    sc.close();
    }   
    
}
