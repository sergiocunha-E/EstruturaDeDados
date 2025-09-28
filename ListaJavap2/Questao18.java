package ListaJavap2;

public class Questao18 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6};
        int[] array2 = {3, 5, 7};
        int[] resultado = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i];
        }

        System.out.println("Resultado da multiplicação dos arrays:");
        for (int n : resultado) {
            System.out.print(n + " ");
        }
    }
}
