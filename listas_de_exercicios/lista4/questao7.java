package listas_de_exercicios.lista4;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        int quadrado, retangulo, triangulo, forma;
        double areaQuadrado, areaRetangulo, alturaRetangulo, areaTriangulo, alturaTriangulo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a forma geometrica (1 - Quadrado, 2 - Retangulo, 3 - Triangulo): ");
        forma = sc.nextInt();
        switch (forma) {
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                quadrado = sc.nextInt();
                areaQuadrado= Math.pow(quadrado, 2);
                System.out.println("Area do quadrado: " + areaQuadrado);
                break;
            case 2:
                System.out.println("Digite o valor da base do retangulo:");
                retangulo = sc.nextInt();
                System.out.println("Digite o valor da altura do retangulo: ");
                alturaRetangulo = sc.nextDouble();
                areaRetangulo = retangulo * alturaRetangulo;
                System.out.println("Area do retangulo: " + areaRetangulo);
                break;
            case 3:
                System.out.println("Digite o valor da base do triangulo: ");
                triangulo = sc.nextInt();
                System.out.println("Digite o valor da altura do triangulo: ");
                alturaTriangulo = sc.nextDouble();
                areaTriangulo = (triangulo * alturaTriangulo) / 2;
                System.out.println("Area do triangulo: " + areaTriangulo);
                break;

            default:
                System.out.println("Forma geometrica invalida!");
                break;
        }
        sc.close();
    }
    
}
