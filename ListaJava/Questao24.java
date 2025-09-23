package ListaJava;

import java.util.Random;

public class Questao24 {

    public static int lancarDado(Random rand) {
        return rand.nextInt(6) + 1; 
    }

    public static void main(String[] args) {
        int[] resultados = new int[100]; 
        int[] contadores = new int[6];  

        Random rand = new Random();

        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = lancarDado(rand);
            contadores[resultados[i] - 1]++; 
        }

        System.out.println("Resultado dos lançamentos do dado (100 lançamentos):");
        for (int i = 0; i < contadores.length; i++) {
            System.out.printf("Valor %d: %d vezes%n", i + 1, contadores[i]);
        }
    }
}
