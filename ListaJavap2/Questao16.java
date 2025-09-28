package ListaJavap2;

public class Questao16 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 30};
        int procurado = 30;
        int indice = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == procurado) {
                indice = i;
                break;
            }
        }

        System.out.println("Índice da primeira ocorrência de " + procurado + ": " + indice);
    }
}
