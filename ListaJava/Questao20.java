package ListaJava;

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;
        double abono;
        double totalAbono = 0;
        double maiorAbono = 0;
        int funcionarios = 0;
        int funcionariosMinimo = 0;

        double[] salarios = new double[1000]; 
        double[] abonos = new double[1000];

        System.out.println("Projeção de Gastos com Abono");
        System.out.println("============================");

        while (true) {
            System.out.print("Salário: ");
            salario = sc.nextDouble();

            if (salario == 0) {
                break; 
            }

            abono = salario * 0.2;
            if (abono < 100) {
                abono = 100;
                funcionariosMinimo++;
            }

            salarios[funcionarios] = salario;
            abonos[funcionarios] = abono;

            funcionarios++;
            totalAbono += abono;

            if (abono > maiorAbono) {
                maiorAbono = abono;
            }
        }

        System.out.println();
        System.out.println("Salário - Abono");
        for (int i = 0; i < funcionarios; i++) {
            System.out.printf("R$ %.2f - R$ %.2f%n", salarios[i], abonos[i]);
        }

        System.out.println();
        System.out.println("Foram processados " + funcionarios + " colaboradores");
        System.out.printf("Total gasto com abonos: R$ %.2f%n", totalAbono);
        System.out.println("Valor mínimo pago a " + funcionariosMinimo + " colaboradores");
        System.out.printf("Maior valor de abono pago: R$ %.2f%n", maiorAbono);

        sc.close();
    }
}
