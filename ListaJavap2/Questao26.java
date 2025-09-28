package ListaJavap2;

import java.util.Scanner;
import java.util.Arrays;

public class Questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite N: ");
        int N = sc.nextInt();
        int[] primos = new int[N];
        int count = 0, num = 2;

        while (count < N) {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                primos[count++] = num;
            }
            num++;
        }

        System.out.println("N primeiros primos: " + Arrays.toString(primos));

        sc.close();
    }
}
