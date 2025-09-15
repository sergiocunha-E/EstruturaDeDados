package ListaJava;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];
            multiplicacao *= numeros[i];
        }
        
        System.out.print("\nNúmeros digitados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        sc.close();
    }
}
