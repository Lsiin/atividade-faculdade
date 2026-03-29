package listas_de_exercicios.lista4;
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        
        int imposto, estado;
        double salario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        salario = sc.nextDouble();
        System.out.println("digite o estado: 1 - BA, 2- SP, 3-RJ");
        estado = sc.nextInt();

        switch (estado) {
            case 1:
                System.out.println("calculando o valor do salário com o imposto da Bahia");
                    imposto = 8;
                    salario = salario -(salario * imposto) / 100;
                    System.out.println("Valor do imposto: " + salario);
                break;
            case 2: 
                System.out.println("calculando o valor do salário com o imposto de São Paulo");
                    imposto = 12;
                    salario = salario -(salario * imposto) / 100;
                    System.out.println("Valor do imposto: " + salario);
                break;
            case 3:
                System.out.println("calculando o valor do salário com o imposto do Rio de Janeiro");
                    imposto = 10;
                    salario = salario -(salario * imposto) / 100;
                    System.out.println("Valor do imposto: " + salario);
                break;

            default:
                System.out.println("Estado não encontrado");
                break;
        }
        sc.close();

    }
}
