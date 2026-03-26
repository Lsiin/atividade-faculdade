package listas_de_exercicios.lista3;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        double salario;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a salario: ");
        salario = sc.nextDouble();
        if (salario>=5000) {
            salario = salario + 1000;
            System.out.println("o salário com bônus é: " + salario);
        
        } else if (salario >=3000) {
            salario = salario + 500;
             System.out.println("o salário é: " + salario);
         
        } else if (salario >=1000) {
            salario = salario + 200;
             System.out.println("o salário é: " + salario);
         } else {
            System.out.println("sem bônus");
        }
    }
    
}

