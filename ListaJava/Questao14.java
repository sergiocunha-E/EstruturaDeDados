package ListaJava;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        int respostasPositivas = 0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + " (s/n): ");
            char resposta = sc.next().toLowerCase().charAt(0);

            if (resposta == 's') {
                respostasPositivas++;
            }
        }

        
        System.out.println("\nClassificação:");
        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas == 3 || respostasPositivas == 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        sc.close();
    }
}
