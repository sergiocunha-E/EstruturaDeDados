package ListaJavap2;

public class Questao12 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int valorProcurado = 30;
        boolean encontrado = false;

        for (int n : numeros) {
            if (n == valorProcurado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor " + valorProcurado + " encontrado no array.");
        } else {
            System.out.println("Valor " + valorProcurado + " não encontrado no array.");
        }
    }
}
