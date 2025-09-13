
package pilhaInvertida;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criar pilha invertida com capacidade 8
        InvertedPilha stack = new InvertedPilha(8);

        // Lista de animais para inserir
        String[] animais = {
            "Cavalo", "Cachorro", "Gato", "Elefante", "Leão", "Tigre",
            "Urso", "Rato", "Macaco", "Lobo", "Lagarto", "Jacaré",
            "Sapo", "Iguana", "Camaleão", "Tartaruga", "Papagaio",
            "Coruja", "Águia", "Pato", "Golfinho", "Baleia", "Polvo",
            "Peixe-palhaço", "Cavalo-marinho", "Borboleta", "Abelha",
            "Formiga", "Joaninha", "Grilo"
        };

        Random random = new Random();

        // Adiciona 5 animais aleatórios
        for (int i = 0; i < 5; i++) {
            String animal = animais[random.nextInt(animais.length)];
            stack.push(animal);
            System.out.println("Push: " + animal);
        }

        // Espiar o topo
        System.out.println("Espiar: " + stack.peek());

        // Pop do topo
        Object removido = stack.pop();
        System.out.println("Pop: " + removido);

        // Atualiza o topo para outro animal aleatório
        String novoAnimal = animais[random.nextInt(animais.length)];
        stack.update(novoAnimal);
        System.out.println("Topo atualizado para: " + novoAnimal);

        // Empilha mais 2 animais
        for (int i = 0; i < 2; i++) {
            String animal = animais[random.nextInt(animais.length)];
            stack.push(animal);
            System.out.println("Push: " + animal);
        }

        // Resultado final
        System.out.println("Pilha final: " + stack.print());
    }
}
