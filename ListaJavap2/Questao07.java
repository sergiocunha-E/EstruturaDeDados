package ListaJavap2;

public class Questao07 {
    public static void main(String[] args) {
        int[] numeros = {3, 8, 5, 10, 12, 7};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) { 
                soma += numeros[i];
            }
        }

        System.out.println("Soma dos elementos nas posições pares: " + soma);
    }
}
