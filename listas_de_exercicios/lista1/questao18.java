package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
      
        String aluno;
        double nota1;
        double nota2;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do aluno");
        aluno = sc.nextLine();
        System.out.println("digite a primeira nota");
        nota1 = sc.nextDouble();
        System.out.println("digite a segunda nota");
        nota2 = sc.nextDouble();
        System.out.println("As notas do aluno " + aluno + " são:");
        System.out.println("nota1: " + nota1);
        System.out.println("nota2: " + nota2);
        double media = (nota1 + nota2) / 2;
        System.out.println("a media do aluno " + aluno + " é: " + media);

    }
}