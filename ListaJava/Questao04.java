package ListaJava;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = new char[10]; // vetor de 10 caracteres
        int contadorConsoantes = 0;

        // leitura dos caracteres
        for (int i = 0; i < letras.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º caractere: ");
            letras[i] = sc.next().charAt(0); // lê o primeiro caractere da String
        }

        System.out.println("\nConsoantes digitadas:");
        for (int i = 0; i < letras.length; i++) {
            char c = Character.toLowerCase(letras[i]); // transforma em minúsculo
            // verifica se é letra e se NÃO é vogal
            if (Character.isLetter(c) && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.print(letras[i] + " ");
                contadorConsoantes++;
            }
        }

        System.out.println("\nTotal de consoantes: " + contadorConsoantes);

        sc.close();
    }
}
