package ListaJavap2;

public class Questao19 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};

        System.out.println("Array original:");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

        for (int i = 0; i < nomes.length / 2; i++) {
            String temp = nomes[i];
            nomes[i] = nomes[nomes.length - 1 - i];
            nomes[nomes.length - 1 - i] = temp;
        }

        System.out.println("\nArray invertido:");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
    }
}
