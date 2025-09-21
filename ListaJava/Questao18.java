package ListaJava;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Questao18 {

    public static double calcularPercentual(int votosJogador, int totalVotos) {
        if (totalVotos == 0) return 0;
        return (votosJogador * 100.0) / totalVotos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] votos = new int[24];
        int totalVotos = 0;

        System.out.println("Enquete: Quem foi o melhor jogador?");
        while (true) {
            System.out.print("Número do jogador (0=fim): ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero < 1 || numero > 23) {
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
            } else {
                votos[numero]++;
                totalVotos++;
            }
        }

        System.out.println("\nResultado da votação:\n");
        System.out.println("Foram computados " + totalVotos + " votos.");
        System.out.printf("%-10s %-10s %-10s%n", "Jogador", "Votos", "%");

        int melhorJogador = 0;
        int maiorVotos = 0;

        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > 0) {
                double percentual = calcularPercentual(votos[i], totalVotos);
                System.out.printf("%-10d %-10d %-10.1f%%%n", i, votos[i], percentual);

                if (votos[i] > maiorVotos) {
                    maiorVotos = votos[i];
                    melhorJogador = i;
                }
            }
        }

        double percentualMelhor = calcularPercentual(maiorVotos, totalVotos);
        System.out.println("\nO melhor jogador foi o número " + melhorJogador +
                ", com " + maiorVotos + " votos, correspondendo a " +
                String.format("%.1f", percentualMelhor) + "% do total de votos.");

        try (PrintWriter writer = new PrintWriter(new FileWriter("resultado_votacao.txt"))) {
            writer.println("Resultado da votação:\n");
            writer.println("Foram computados " + totalVotos + " votos.");
            writer.printf("%-10s %-10s %-10s%n", "Jogador", "Votos", "%");

            for (int i = 1; i < votos.length; i++) {
                if (votos[i] > 0) {
                    double percentual = calcularPercentual(votos[i], totalVotos);
                    writer.printf("%-10d %-10d %-10.1f%%%n", i, votos[i], percentual);
                }
            }

            writer.println("\nO melhor jogador foi o número " + melhorJogador +
                    ", com " + maiorVotos + " votos, correspondendo a " +
                    String.format("%.1f", percentualMelhor) + "% do total de votos.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
