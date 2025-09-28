package ListaJavap2;

import java.util.Arrays;
import java.util.Random;

public class Questao15 {
    public static void main(String[] args) {
        int tamanho = 10;
        int[] numeros = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.println("Array original (aleatório):");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println("\nArray ordenado em ordem decrescente:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
