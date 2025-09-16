package ListaJava;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int somaQuadrados = 0;

    
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            somaQuadrados += (int) Math.pow(A[i], 2);
        }
        System.out.println("\nSoma dos quadrados dos elementos do vetor: " + somaQuadrados);

        sc.close();
    }
}
