package ListaJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        double soma = 0;
        double nota;

        System.out.println("Digite as notas (ou -1 para encerrar):");
        while (true) {
            nota = sc.nextDouble();
            if (nota == -1) {
                break; 
            }
            notas.add(nota);
            soma += nota;
        }

        int quantidade = notas.size();
        System.out.println("\nQuantidade de valores lidos: " + quantidade);

        System.out.print("Valores na ordem informada: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Valores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        System.out.println("Soma dos valores: " + soma);
        double media = (quantidade > 0) ? soma / quantidade : 0;
        System.out.println("Média dos valores: " + media);

        int acimaMedia = 0;
        int abaixoDeSete = 0;
        for (double n : notas) {
            if (n > media) {
                acimaMedia++;
            }
            if (n < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        System.out.println("\nPrograma encerrado. Obrigado por utilizar!");
        
        sc.close();
    }
}
