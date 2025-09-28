package ListaJavap2;

public class Questao25 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1};
        boolean palindromo = true;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        System.out.println("O array é palíndromo? " + palindromo);
    }
}
