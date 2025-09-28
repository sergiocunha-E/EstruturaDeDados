package ListaJavap2;

import java.util.Arrays;

public class Questao17 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean iguais = Arrays.equals(array1, array2);

        if (iguais) {
            System.out.println("Os arrays são iguais.");
        } else {
            System.out.println("Os arrays são diferentes.");
        }
    }
}
