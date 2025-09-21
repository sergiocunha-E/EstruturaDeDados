package ListaJava;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do atleta (ou ENTER para encerrar): ");
            String nome = sc.nextLine();

            if (nome.isEmpty()) {
                System.out.println("\nPrograma encerrado.");
                break;
            }

            double[] saltos = new double[5];
            double soma = 0;

            for (int i = 0; i < saltos.length; i++) {
                System.out.print("Digite a distância do " + (i + 1) + "º salto: ");
                saltos[i] = sc.nextDouble();
                soma += saltos[i];
            }
            sc.nextLine(); 

            double media = soma / saltos.length;

            
            System.out.println("\nAtleta: " + nome);
            System.out.println("Primeiro Salto: " + saltos[0] + " m");
            System.out.println("Segundo Salto: " + saltos[1] + " m");
            System.out.println("Terceiro Salto: " + saltos[2] + " m");
            System.out.println("Quarto Salto: " + saltos[3] + " m");
            System.out.println("Quinto Salto: " + saltos[4] + " m");

            System.out.println("\nResultado final:");
            System.out.print("Atleta: " + nome + "\nSaltos: ");
            for (int i = 0; i < saltos.length; i++) {
                System.out.print(saltos[i]);
                if (i < saltos.length - 1) {
                    System.out.print(" - ");
                }
            }
            System.out.println("\nMédia dos saltos: " + String.format("%.1f", media) + " m\n");
        }

        sc.close();
    }
}

