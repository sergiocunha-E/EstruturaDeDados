package filaCircular;

public class Main {
    public static void main(String[] args) {

       
        CircularQueue fila = new CircularQueue(5);

        System.out.println("=== TESTE BÁSICO ===");
        fila.enqueue("Cachorro");
        fila.enqueue("Gato");
        fila.enqueue("Papagaio");
        System.out.println("Fila: " + fila.print()); 
        System.out.println("Frente: " + fila.front()); 

        System.out.println("\n=== TESTANDO DEQUEUE ===");
        System.out.println("Removido: " + fila.dequeue()); 
        System.out.println("Fila após remover: " + fila.print()); 

        System.out.println("\n=== TESTANDO ATUALIZAÇÕES ===");
        fila.startUpdate("Gato Preto"); 
        fila.endUpdate("Papagaio Azul");
        System.out.println("Fila após updates: " + fila.print()); 

        System.out.println("\n=== TESTANDO REAPROVEITAMENTO (CIRCULARIDADE) ===");
        fila.enqueue("Tartaruga");
        fila.enqueue("Macaco");
        fila.enqueue("Leão"); 
        System.out.println("Fila cheia: " + fila.print());
        System.out.println("Fila está cheia? " + fila.isFull());

        System.out.println("\n=== REMOVENDO PARA VER CIRCULARIDADE ===");
        System.out.println("Removido: " + fila.dequeue());
        System.out.println("Removido: " + fila.dequeue());
        fila.enqueue("Elefante"); 
        fila.enqueue("Girafa");
        System.out.println("Fila após wrap-around: " + fila.print());

        System.out.println("\n=== ESVAZIANDO FILA ===");
        while (!fila.isEmpty()) {
            System.out.println("Removido: " + fila.dequeue());
        }
        System.out.println("Fila final: " + fila.print());
        System.out.println("Fila está vazia? " + fila.isEmpty());
    }
}
