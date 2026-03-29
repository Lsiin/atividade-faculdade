package listas_de_exercicios.lista2;
import java.util.Scanner;

class questao7 {
    public static void main(String[] args) {
   int temperatura;
   Scanner sc = new Scanner(System.in);
    System.out.println("Digite a temperatura em graus Celsius: ");
    temperatura = sc.nextInt();

    if(temperatura>=30){
        System.out.println("você está com febre");
    } else {
        System.out.println("você não está com febre");
    }
    sc.close();
}
}
