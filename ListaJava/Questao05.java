package ListaJava;

import java.util.Scanner;
import java.util.ArrayList;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]);
            } else {
                impares.add(numeros[i]);
            }
        }

        System.out.println("\nVetor original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nVetor de pares:");
        for (int num : pares) {
            System.out.print(num + " ");
        }

        
        System.out.println("\n\nVetor de ímpares:");
        for (int num : impares) {
            System.out.print(num + " ");

            sc.close();
        }
    }
}
