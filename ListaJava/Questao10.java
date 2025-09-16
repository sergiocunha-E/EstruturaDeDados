package ListaJava;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

 
        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = sc.nextInt();
        }

      
        System.out.println("\nDigite os 10 elementos do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = sc.nextInt();
        }

       
        int posicao = 0;
        for (int i = 0; i < 10; i++) {
            vetorC[posicao++] = vetorA[i];
            vetorC[posicao++] = vetorB[i]; 
        }

     
        System.out.println("\nVetor C (intercalado):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        sc.close();
    }
}
