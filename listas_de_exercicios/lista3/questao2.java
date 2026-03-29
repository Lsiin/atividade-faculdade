package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do aluno: ");
        idade = sc.nextInt();
        if (idade <=12) {
            System.out.println("criança!!");
        } else if (idade <=17) {
            System.out.println("adolescente!!");
        } else if (idade <=59) {
            System.out.println("adulto!!");
        } else {
            System.out.println("idoso!!");
        }
        sc.close();
    }
    
}
