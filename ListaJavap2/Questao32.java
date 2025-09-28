package ListaJavap2;

import java.util.Arrays;

public class Questao32 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        int chave = 7;

        int indice = Arrays.binarySearch(array, chave);
        System.out.println("Índice do elemento " + chave + ": " + indice);
    }
}
