package ListaJavap2;

import java.util.Scanner;
import java.util.Arrays;

public class Questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array original: " + Arrays.toString(array));

        System.out.print("Digite a posição para inserir: ");
        int pos = sc.nextInt();
        System.out.print("Digite o elemento: ");
        int elem = sc.nextInt();

        int[] novoArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < novoArray.length; i++) {
            if (i == pos) {
                novoArray[i] = elem;
            } else {
                novoArray[i] = array[j++];
            }
        }

        System.out.println("Array atualizado: " + Arrays.toString(novoArray));

        sc.close();
    }
}
