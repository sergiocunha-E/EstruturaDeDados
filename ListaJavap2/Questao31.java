package ListaJavap2;

import java.util.Arrays;

public class Questao31 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int primeira = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = primeira;

        System.out.println("Array rotacionado à esquerda: " + Arrays.toString(array));
    }
}
