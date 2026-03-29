package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double horas;
    String tipoVeiculo;
    double valorTotal;

    System.out.println("Digite o número de horas: ");
    horas = sc.nextDouble();

    System.out.println("Informe o tipo de veículo (M - moto, C - Carro, O - Ônibus): ");
    tipoVeiculo = sc.next().toUpperCase();

    switch (tipoVeiculo) {
        case "M":
            valorTotal = horas * 5.00;
            System.out.println("Valor total a pagar para a moto: " + valorTotal);
            
            break;
    
        case "C":
            valorTotal = horas * 10.00;
            System.out.println("Valor total a pagar para o carro: " + valorTotal);
            
            break;
    
        case "O":
            valorTotal = horas * 20.00;
            System.out.println("Valor total a pagar para o ônibus: " + valorTotal);
            
            break;
    
        default:
            System.out.println("Tipo de veículo inválido.");
            break;
        
    }
    sc.close();
    }
}
