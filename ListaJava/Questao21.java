package ListaJava;

public class Questao21 {
    public static void main(String[] args) {
        String[] modelos = {"fusca", "gol", "uno", "vectra", "peugeout"};
        double[] consumo = {7.0, 10.0, 12.5, 9.0, 14.5}; 

        double distancia = 1000.0; 
        double precoLitro = 2.25; 

        double litros, custo;
        double menorConsumo = consumo[0];
        int indiceMaisEconomico = 0;

        System.out.println("Comparativo de Consumo de Combustível");

        for (int i = 0; i < modelos.length; i++) {
            System.out.println("Veículo " + (i + 1));
            System.out.println("Nome: " + modelos[i]);
            System.out.println("Km por litro: " + consumo[i]);
        }

        System.out.println();
        System.out.println("Relatório Final");

        for (int i = 0; i < modelos.length; i++) {
            litros = distancia / consumo[i];
            custo = litros * precoLitro;

            System.out.printf("%d - %s - %.1f - %.1f litros - R$ %.2f%n",
                    (i + 1), modelos[i], consumo[i], litros, custo);

            if (consumo[i] > menorConsumo) {
                menorConsumo = consumo[i];
                indiceMaisEconomico = i;
            }
        }

        System.out.println();
        System.out.println("O menor consumo é do " + modelos[indiceMaisEconomico] + ".");
    }
}
