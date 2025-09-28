package ListaJavap2;

import java.util.Scanner;
import java.util.ArrayList;

public class Questao27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite N: ");
        int N = sc.nextInt();
        ArrayList<Integer> perfeitos = new ArrayList<>();

        for (int num = 2; num < N; num++) {
            int soma = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) soma += i;
            }
            if (soma == num) {
                perfeitos.add(num);
            }
        }

        System.out.println("Números perfeitos menores que " + N + ": " + perfeitos);

        sc.close();
    }
}
