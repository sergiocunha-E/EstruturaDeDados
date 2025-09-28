package ListaJavap2;

public class Questao21 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < array.length; i++) {
            if ("aeiouAEIOU".indexOf(array[i]) != -1) {
                array[i] = '*';
            }
        }
        System.out.print("Array modificado: ");
        for (char c : array) {
            System.out.print(c + " ");
        }
    }
}
