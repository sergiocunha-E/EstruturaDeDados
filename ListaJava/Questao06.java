package ListaJava;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] medias = new double[10];
        int aprovados = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.print("Digite a nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite a nota 2: ");
            double n2 = sc.nextDouble();
            System.out.print("Digite a nota 3: ");
            double n3 = sc.nextDouble();
            System.out.print("Digite a nota 4: ");
            double n4 = sc.nextDouble();

            double media = (n1 + n2 + n3 + n4) / 4.0;
            medias[i] = media;

            if (media >= 7.0) {
                aprovados++;
            }
        }

 
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Aluno %d: %.2f%n", i + 1, medias[i]);
        }

        System.out.println("\nQuantidade de alunos com média >= 7.0: " + aprovados);

        sc.close();
    }
}
