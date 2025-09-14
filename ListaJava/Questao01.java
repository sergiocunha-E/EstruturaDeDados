package ListaJava;

import java.util.Scanner; // import vai aqui

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5]; // vetor de 5 posições
        
        // leitura dos números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("\nNúmeros digitados:");
        
        // exibição dos números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        
        sc.close();
    }
}
