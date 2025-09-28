package ListaJavap2;

import java.util.Arrays;

public class Questao33 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println("Array antes: " + Arrays.toString(array));

        int[] novoArray = Arrays.copyOf(array, array.length + 1);
        novoArray[novoArray.length - 1] = 4;

        System.out.println("Array depois: " + Arrays.toString(novoArray));
    }
}
