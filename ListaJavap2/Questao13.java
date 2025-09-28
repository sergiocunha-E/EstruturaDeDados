package ListaJavap2;

public class Questao13 {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayCopia = new int[arrayOriginal.length];

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayCopia[i] = arrayOriginal[i];
        }

        System.out.println("Array original:");
        for (int n : arrayOriginal) {
            System.out.print(n + " ");
        }

        System.out.println("\nArray copiado:");
        for (int n : arrayCopia) {
            System.out.print(n + " ");
        }
    }
}
