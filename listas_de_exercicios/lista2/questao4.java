package listas_de_exercicios.lista2;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
    float nota;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a nota do aluno: ");
    nota = sc.nextFloat();
    if(nota>=7){
        System.out.println("Aluno aprovado");
    } else {
        System.out.println("Aluno reprovado");
    }
}
}
