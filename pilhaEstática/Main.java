package pilhaEstática;

public class Main {
    public static void main(String[] args) {
        StackOperations stack = new StaticStack(4);

        stack.push("Leão");
        stack.push("Onça");
        stack.push("Cachorro");
        stack.push("Gato");

        System.out.println("Pilha: " + stack.print());
        System.out.println("Topo: " + stack.peek());

        stack.pop();
        System.out.println("Depois do pop: " + stack.print());

        stack.update("Papagaio");
        System.out.println("Depois do update: " + stack.print());

        System.out.println("Está cheia? " + stack.isFull());
        System.out.println("Está vazia? " + stack.isEmpty());
    }
}
