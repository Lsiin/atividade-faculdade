package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
         int setor;
    double acrescimo, salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        salario = sc.nextDouble();
        System.out.println("Digite o setor do funcionário (1 - TI, 2 - RH, 3 - ADM): ");
        setor = sc.nextInt();

        switch (setor) {
            case 1:
                double ti = (salario*12)/100;
                System.out.println("Valor do acrescimo para o setor de TI: " + ti);
                acrescimo = salario + ti;
                System.out.println("Valor total a pagar: " + String.format("%.2f", acrescimo));
                break;
            case 2:
                double rh = (salario * 8)/100;
                System.out.println("Valor do acrescimo para o setor de RH: " + rh);
                acrescimo = salario + rh;
                System.out.println("Valor total a pagar: " + String.format("%.2f", acrescimo));
                break;
            case 3:
                double adm = (salario * 5)/100;
                System.out.println("Valor do acrescimo para o setor de ADM: " + adm);
                acrescimo = salario + adm;
                System.out.println("Valor total a pagar: " + String.format("%.2f", acrescimo));
                break;
            default:
                System.out.println("Tipo de setor inválido.");
                break;
        }
        sc.close();
    }
    }
    

