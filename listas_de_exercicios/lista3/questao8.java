package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        nota = sc.nextInt();
        if (nota >=7) {
            
            System.out.println("Aluno aprovado!!");
        } else if (nota >=5) {
    
             System.out.println("Aluno em recuperação!!");
         } else {
            System.out.println("Aluno reprovado!!");
        }
    }
    
}

