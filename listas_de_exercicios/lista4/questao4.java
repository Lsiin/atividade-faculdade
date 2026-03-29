package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
    int cargo;
    double acrescimo, salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        salario = sc.nextDouble();
        System.out.println("Digite o cargo do funcionário (1 - Gerente, 2 - Supervisor, 3 - Funcionário): ");
        cargo = sc.nextInt();

        switch (cargo) {
            case 1:
                double gerente = (salario*20)/100;
                System.out.println("Valor do acrescimo para o gerente: " + gerente);
                acrescimo = salario + gerente;
                System.out.println("Valor total a pagar: " + String.format("%.2f", acrescimo));
                break;
            case 2:
                double supervisor = (salario * 10)/100;
                System.out.println("Valor do acrescimo para supervisor: " + supervisor);
                acrescimo = salario + supervisor;
                System.out.println("Valor total a pagar: " + String.format("%.2f", acrescimo));
                break;
            case 3:
                double funcionario = (salario * 15)/100;
                System.out.println("Valor do acrescimo para funcionário: " + funcionario);
                acrescimo = salario + funcionario;
                System.out.println("Valor total a pagar: " + String.format("%.2f", acrescimo));
                break;
            default:
                System.out.println("Tipo de cargo inválido.");
                break;
        }
        sc.close();
    }
    
}
