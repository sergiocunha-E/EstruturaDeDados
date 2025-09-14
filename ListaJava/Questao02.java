package ListaJava;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10]; // vetor de 10 posições

        // leitura dos números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("\nNúmeros na ordem inversa:");

        // exibição na ordem inversa
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        sc.close();
    }
}
