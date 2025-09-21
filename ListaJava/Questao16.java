package ListaJava;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int[] contadores = new int[9];

        System.out.print("Digite a quantidade de vendedores: ");
        int qtdVendedores = sc.nextInt();

        for (int i = 1; i <= qtdVendedores; i++) {
            System.out.print("Digite as vendas brutas do vendedor " + i + ": ");
            double vendas = sc.nextDouble();

      
            double salario = 200 + (0.09 * vendas);

            if (salario >= 1000) {
                contadores[8]++; 
            } else {
                int indice = (int) ((salario - 200) / 100);
                contadores[indice]++;
            }
        }

        System.out.println("\nQuantidade de vendedores por faixa salarial:");
        System.out.println("$200 - $299: " + contadores[0]);
        System.out.println("$300 - $399: " + contadores[1]);
        System.out.println("$400 - $499: " + contadores[2]);
        System.out.println("$500 - $599: " + contadores[3]);
        System.out.println("$600 - $699: " + contadores[4]);
        System.out.println("$700 - $799: " + contadores[5]);
        System.out.println("$800 - $899: " + contadores[6]);
        System.out.println("$900 - $999: " + contadores[7]);
        System.out.println("$1000 em diante: " + contadores[8]);

        sc.close();
    }
}

