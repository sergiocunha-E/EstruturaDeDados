package ListaJavap2;

public class Questao22 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'e', 'i', 'o', 'u'};
        int contador = 0;
        for (char c : array) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println("Número de vogais: " + contador);
    }
}
