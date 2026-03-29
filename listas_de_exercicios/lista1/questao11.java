package listas_de_exercicios.lista1;
import java.util.Arrays;
import java.util.Scanner;
public class questao11 {
    public static void main(String[] args) 
    {
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        a= sc.nextDouble();
        System.out.println("digite o segundo numero");
        b= sc.nextDouble();
        System.out.println("digite o terceiro numero");
        c= sc.nextDouble();


        double media= Arrays.stream(new double[]{a,b,c}).average().orElse(0);
        System.out.println("a media dos numeros é: "+media);
        sc.close();
    }
    
}
