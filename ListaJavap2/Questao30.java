package ListaJavap2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Questao30 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int n : array) {
            set.add(n);
        }

        int[] novoArray = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Array sem repetidos: " + Arrays.toString(novoArray));
    }
}
