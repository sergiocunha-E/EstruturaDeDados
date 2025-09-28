package ListaJavap2;

public class Questao10 {
    public static void main(String[] args) {
        int[] numeros = {5, -3, 8, -7, 12, -1};

        System.out.println("Array original:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }

        System.out.println("\nArray após substituir negativos por zero:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
