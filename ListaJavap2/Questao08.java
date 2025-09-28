package ListaJavap2;

public class Questao08 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10};
        int multiplicador = 3;

        System.out.println("Array original:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= multiplicador;
        }

        System.out.println("\nArray após multiplicação por " + multiplicador + ":");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
