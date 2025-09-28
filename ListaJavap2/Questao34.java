package ListaJavap2;

import java.util.Arrays;

public class Questao34 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        int pos = 2;
        int elem = 3;

        int[] novoArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < novoArray.length; i++) {
            if (i == pos) {
                novoArray[i] = elem;
            } else {
                novoArray[i] = array[j++];
            }
        }

        System.out.println("Array atualizado: " + Arrays.toString(novoArray));
    }
}
