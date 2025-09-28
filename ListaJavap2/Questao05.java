package ListaJavap2;

public class Questao05 {
    public static void main(String[] args) {
        int[] numeros = {10, 45, 32, 67, 23, 67, 5};

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int n : numeros) {
            if (n > maior) {
                segundoMaior = maior;
                maior = n;
            } else if (n > segundoMaior && n < maior) {
                segundoMaior = n;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Segundo maior número: " + segundoMaior);
    }
}
