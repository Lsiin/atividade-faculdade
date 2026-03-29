package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");
        nota = sc.nextDouble();
        if (nota >=9) {
            System.out.println("Excelente!!");
        } else if (nota >=7) {
            System.out.println("bom!!");
        } else if (nota >=5) {
            System.out.println("regular");
        } else {
            System.out.println("Reprovado!!");
        }
        sc.close();
    }
    
}
