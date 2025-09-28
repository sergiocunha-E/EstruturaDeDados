package ListaJavap2;

public class Questao04 {
    public static void main(String[] args) {
        int[] numeros = {12, 45, 7, 89, 23, 5};

        int maior = numeros[0];
        int menor = numeros[0];

        for (int n : numeros) {
            if (n > maior) maior = n;
            if (n < menor) menor = n;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
