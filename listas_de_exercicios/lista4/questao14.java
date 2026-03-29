package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, categoria, total;
        int preco = 50;
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
        System.out.println("Digite a categoria (1 - ESTUDANTE, 2 - IDOSO, 3 - COMUM): ");
        categoria = sc.nextInt();
        switch (categoria) {
            case 1:
                System.out.println("Possui carteirinha de estudante? (S/N): ");
                char carteirinha = sc.next().charAt(0);
                 if (idade>=60) {
                    total = 0;
                    System.out.println("Mesmo sendo estudante, atingiu a maior idade, portanto é de graça. Valor do ingresso: " + total);
                }
                else if (carteirinha == 'S' || carteirinha == 's') {
                    total = preco / 2;
                    System.out.println("Valor do ingresso para estudante: " + total);
                } else {
                    System.out.println("condição inválida para estudante.");
                }
                break;
            case 2:
                if (idade >= 60) {
                    total = 0;
                    System.out.println("É gratuíto para idosos! Valor do ingresso: " + total);
                } else {
                    System.out.println("Idade inválida para a categoria idoso.");
                }
                break;
            case 3:
                System.out.println("Valor do ingresso para comum: " + preco);
                break;
            default:
                System.out.println("Categoria inválida.");
                break;
        }
        sc.close();
    }
}
