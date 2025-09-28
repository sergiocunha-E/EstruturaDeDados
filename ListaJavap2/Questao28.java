package ListaJavap2;

import java.util.Scanner;
import java.util.Arrays;

public class Questao28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite N: ");
        int N = sc.nextInt();
        int[] fibonacci = new int[N];

        if (N > 0) fibonacci[0] = 0;
        if (N > 1) fibonacci[1] = 1;

        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.println("Sequência de Fibonacci: " + Arrays.toString(fibonacci));

        sc.close();
    }
}
