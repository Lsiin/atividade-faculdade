package listas_de_exercicios.lista1;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        double horasTrabalhadas;
        double valorHora;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite as horas trabalhadas");
        horasTrabalhadas= sc.nextDouble();
        System.out.println(" Digite o valor das horas trabalhadas");
        valorHora= sc.nextDouble();

        Double salarioDia= horasTrabalhadas * valorHora;
        System.out.println("o salário do funcionário é:"+salarioDia);
        
        sc.close();
    }
    
}
