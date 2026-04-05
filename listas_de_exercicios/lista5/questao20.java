package listas_de_exercicios.lista5;

public class questao20 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i =1; i<=20; i++){
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos numeros pares até 20 é: " + soma);
    }
}
