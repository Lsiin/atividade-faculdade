package listas_de_exercicios.lista4;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double consumo;
    String tipoResidencia;
    double valorTotal;

    System.out.println("Digite o consumo em kWh: ");
    consumo = sc.nextDouble();

    System.out.println("Informe o tipo de residência (R - Residencial, C - Comercial, I - Industrial): ");
    tipoResidencia = sc.next().toUpperCase();

    switch (tipoResidencia) {
        case "R":
            valorTotal = consumo * 0.60;
            System.out.println("Valor total a pagar para residência: " + valorTotal);
            
            break;
    
        case "C":
            valorTotal = consumo * 0.80;
            System.out.println("Valor total a pagar para comercial: " + valorTotal);
            
            break;
    
        case "I":
            valorTotal = consumo * 1.20;
            System.out.println("Valor total a pagar para industrial: " + valorTotal);
            
            break;
    
        default:
            System.out.println("Tipo de residência inválido.");
            break;
        
    }
    sc.close();
}}
