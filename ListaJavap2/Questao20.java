package ListaJavap2;

public class Questao20 {
    public static void main(String[] args) {
        String[] palavras = {"casa", "carro", "rua", "carro", "praia", "carro"};
        String remover = "carro";

        System.out.println("Array original:");
        for (String p : palavras) {
            System.out.print(p + " ");
        }

        System.out.println("\nArray sem \"" + remover + "\":");
        for (String p : palavras) {
            if (!p.equals(remover)) {
                System.out.print(p + " ");
            }
        }
    }
}
