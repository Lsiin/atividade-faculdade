package listas_de_exercicios.lista4;
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nomeCandidato;
        int votos;
        System.out.println("Digite o número do candidato (1- Lula, 2 - Bolsonaro, 3 - Marina Silva): ");
        nomeCandidato = sc.nextInt();
        System.out.println("Confirma o voto? (1 - Sim / 0 - Não): ");
        votos = sc.nextInt();

        if (votos == 1 || votos == 0) {
            switch (nomeCandidato) {
                case 1:
                    System.out.println("Lula recebeu " + votos + " voto(s).");
                    break;
                case 2:
                    System.out.println("Bolsonaro recebeu " + votos + " voto(s).");
                    break;
                case 3:
                    System.out.println("Marina Silva recebeu " + votos + " voto(s).");
                    break;
                default:
                    System.out.println("Número de candidato inválido.");
                    break;
            }
        } else {
            System.out.println("Confirmação inválida. Digite apenas 1 para Sim ou 0 para Não.");
        }
        sc.close();
    }
}