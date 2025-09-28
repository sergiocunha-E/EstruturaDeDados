package ListaJavap2;

public class Questao11 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        int soma = 0;

        for (int n : numeros) {
            soma += n;
        }

        double media = (double) soma / numeros.length;
        System.out.println("Média dos elementos: " + media);
    }
}
