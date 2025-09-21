package ListaJava;

import java.util.Scanner;

public class Questao19 {

    public static double calcularPercentual(int votos, int total) {
        if (total == 0) return 0;
        return (votos * 100.0) / total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sistemas = {
            "Windows Server",
            "Unix",
            "Linux",
            "Netware",
            "Mac OS",
            "Outro"
        };

        int[] votos = new int[sistemas.length]; 
        int totalVotos = 0;

        System.out.println("Enquete: Qual o melhor Sistema Operacional para uso em servidores?");
        System.out.println("As opções são:");
        for (int i = 0; i < sistemas.length; i++) {
            System.out.println((i + 1) + " - " + sistemas[i]);
        }
        System.out.println("0 - Encerrar votação");

        while (true) {
            System.out.print("Número do Sistema Operacional (0=fim): ");
            int escolha = sc.nextInt();

            if (escolha == 0) {
                break; 
            }

            if (escolha < 0 || escolha > 6) {
                System.out.println("Valor inválido! Digite um número entre 1 e 6, ou 0 para sair.");
            } else {
                votos[escolha - 1]++;
                totalVotos++;
            }
        }

        System.out.println("\nResultado da enquete:\n");
        System.out.printf("%-20s %-7s %-5s%n", "Sistema Operacional", "Votos", "%");
        System.out.println("-------------------  -----  ---");

        int maisVotadoIndex = 0;
        int maiorVotos = 0;

        for (int i = 0; i < sistemas.length; i++) {
            if (votos[i] > 0) {
                double percentual = calcularPercentual(votos[i], totalVotos);
                System.out.printf("%-20s %-7d %.0f%%%n", sistemas[i], votos[i], percentual);

                if (votos[i] > maiorVotos) {
                    maiorVotos = votos[i];
                    maisVotadoIndex = i;
                }
            } else {
                System.out.printf("%-20s %-7d %.0f%%%n", sistemas[i], votos[i], 0.0);
            }
        }

        System.out.println("-------------------  -----");
        System.out.println("Total                " + totalVotos);

        double percentualMaisVotado = calcularPercentual(maiorVotos, totalVotos);
        System.out.println("\nO Sistema Operacional mais votado foi o " +
                sistemas[maisVotadoIndex] + ", com " + maiorVotos +
                " votos, correspondendo a " + String.format("%.0f", percentualMaisVotado) + "%.");

        sc.close();
    }
}
