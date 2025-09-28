package ListaJavap2;

public class Questao09 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 20, 8, 3};
        int contadorPares = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de elementos pares: " + contadorPares);
    }
}
