package ListaJava;

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idMouse;
        int tipoDefeito;

        int qtdEsfera = 0;
        int qtdLimpeza = 0;
        int qtdCabo = 0;
        int qtdQuebrado = 0;
        int totalMouses = 0;

        System.out.println("Registro de Levantamento de Mouses");
        System.out.println("=================================");

        while (true) {
            System.out.print("Digite o ID do mouse (0 para encerrar): ");
            idMouse = sc.nextInt();

            if (idMouse == 0) {
                break; 
            }

            System.out.println("Selecione o tipo de defeito:");
            System.out.println("1 - necessita da esfera");
            System.out.println("2 - necessita de limpeza");
            System.out.println("3 - necessita troca do cabo ou conector");
            System.out.println("4 - quebrado ou inutilizado");
            System.out.print("Tipo de defeito: ");
            tipoDefeito = sc.nextInt();

            switch (tipoDefeito) {
                case 1:
                    qtdEsfera++;
                    break;
                case 2:
                    qtdLimpeza++;
                    break;
                case 3:
                    qtdCabo++;
                    break;
                case 4:
                    qtdQuebrado++;
                    break;
                default:
                    System.out.println("Tipo de defeito inválido. Tente novamente.");
                    continue;
            }

            totalMouses++;
        }

        double percEsfera = (totalMouses > 0) ? (qtdEsfera * 100.0 / totalMouses) : 0;
        double percLimpeza = (totalMouses > 0) ? (qtdLimpeza * 100.0 / totalMouses) : 0;
        double percCabo = (totalMouses > 0) ? (qtdCabo * 100.0 / totalMouses) : 0;
        double percQuebrado = (totalMouses > 0) ? (qtdQuebrado * 100.0 / totalMouses) : 0;

        System.out.println();
        System.out.println("Quantidade de mouses: " + totalMouses);
        System.out.println();
        System.out.println("Situação         Quantidade  Percentual");
        System.out.printf("1- necessita da esfera      %d        %.0f%%%n", qtdEsfera, percEsfera);
        System.out.printf("2- necessita de limpeza     %d        %.0f%%%n", qtdLimpeza, percLimpeza);
        System.out.printf("3- necessita troca do cabo  %d        %.0f%%%n", qtdCabo, percCabo);
        System.out.printf("4- quebrado ou inutilizado  %d        %.0f%%%n", qtdQuebrado, percQuebrado);

        sc.close();
    }
}
