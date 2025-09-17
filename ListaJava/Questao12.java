package ListaJava;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAlturas = 0.0;
        for (int i = 0; i < 30; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = sc.nextInt();

            System.out.print("Digite a altura do aluno " + (i + 1) + " (em metros): ");
            alturas[i] = sc.nextDouble();

            somaAlturas += alturas[i];
        }
        double mediaAltura = somaAlturas / 30.0;

        int contador = 0;
        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }

        System.out.println("\nMédia de altura: " + String.format("%.2f", mediaAltura) + " m");
        System.out.println("Quantidade de alunos com mais de 13 anos e altura abaixo da média: " + contador);

        sc.close();
    }
}
