package ListaJavap2;

import java.util.Arrays;

public class Questao14 {
    public static void main(String[] args) {
        int[] numeros = {42, 15, 8, 23, 4};

        System.out.println("Array original:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        Arrays.sort(numeros);

        System.out.println("\nArray ordenado em ordem crescente:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
