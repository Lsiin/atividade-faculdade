package listas_de_exercicios.lista6;

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0, voto;
        do {
            System.out.print("1-Candidato A | 2-Candidato B | 3-Candidato C | 0-Encerrar: ");
            voto = sc.nextInt();
            if (voto == 1) a++;
            else if (voto == 2) b++;
            else if (voto == 3) c++;
        } while (voto != 0);
        System.out.println("Candidato A: " + a + " votos");
        System.out.println("Candidato B: " + b + " votos");
        System.out.println("Candidato C: " + c + " votos");
        String vencedor = a >= b && a >= c ? "A" : b >= c ? "B" : "C";
        System.out.println("Vencedor: Candidato " + vencedor);
        sc.close();
    }
}
