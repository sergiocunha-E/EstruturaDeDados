package ListaJavap2;

public class Questao03 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int[] inverso = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            inverso[i] = numeros[numeros.length - 1 - i];
        }

        System.out.println("Array original:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\nArray invertido:");
        for (int n : inverso) {
            System.out.print(n + " ");
        }
    }
}
