package ListaJavap2;

import java.util.Arrays;

public class Questao35 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int pos = 2;

        int[] novoArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != pos) {
                novoArray[j++] = array[i];
            }
        }

        System.out.println("Array após remoção: " + Arrays.toString(novoArray));
    }
}
