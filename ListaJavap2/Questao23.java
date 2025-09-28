package ListaJavap2;

public class Questao23 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] novoArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            novoArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            novoArray[array1.length + i] = array2[i];
        }

        System.out.print("Novo array: ");
        for (int n : novoArray) {
            System.out.print(n + " ");
        }
    }
}
