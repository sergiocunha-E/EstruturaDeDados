package ListaJava;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int[] D = new int[30];

        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os 10 elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            B[i] = sc.nextInt();
        }

      
        System.out.println("Digite os 10 elementos do vetor C:");
        for (int i = 0; i < 10; i++) {
            C[i] = sc.nextInt();
        }

       
        int index = 0;
        for (int i = 0; i < 10; i++) {
            D[index++] = A[i];
            D[index++] = B[i];
            D[index++] = C[i];
        }

        System.out.println("\nVetor intercalado:");
        for (int i = 0; i < D.length; i++) {
            System.out.print(D[i] + " ");
        }

        sc.close();
    }
}
