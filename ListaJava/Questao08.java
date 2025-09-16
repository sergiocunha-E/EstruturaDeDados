package ListaJava;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[5];
        double[] alturas = new double[5];

        // Leitura das idades e alturas
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();

            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
        }

        System.out.println("\n--- Dados na ordem inversa ---");
        for (int i = 4; i >= 0; i--) {
            System.out.printf("Pessoa %d - Idade: %d anos, Altura: %.2f m%n",
                    (i + 1), idades[i], alturas[i]);
        }

        sc.close();
    }
}
