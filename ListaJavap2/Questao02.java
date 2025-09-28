package ListaJavap2;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();

        int[] quadrados = new int[N];

        for (int i = 0; i < N; i++) {
            quadrados[i] = (i + 1) * (i + 1);
        }

        System.out.println("Quadrados de 1 até " + N + ":");
        for (int i = 0; i < N; i++) {
            System.out.println("Posição " + i + " = " + quadrados[i]);
        }

        sc.close();
    }
}
