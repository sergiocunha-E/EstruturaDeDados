package ListaJavap2;

public class Questao06 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        int soma = 0;

        for (int n : numeros) {
            soma += n;
        }

        System.out.println("Soma de todos os elementos: " + soma);
    }
}
