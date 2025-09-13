package filaCircular;

public class CircularQueue implements CircularQueueInterface {

    private int head;
    private int tail;
    private Object[] data;
    private int numberOfElements;

    public CircularQueue() {
        this(12);
    }

    public CircularQueue(int tamanho) {
        head = 0;
        tail = -1;
        data = new Object[tamanho];
        numberOfElements = 0;
    }

    @Override
    public void enqueue(Object item) {
        if (!isFull()) {
            tail = next(tail);
            data[tail] = item;
            numberOfElements++;
        } else {
            System.err.println("Fila está cheia!");
        }
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            System.err.println("Fila vazia!");
            return null;
        }
        Object dadoRetornado = data[head];
        head = next(head);
        numberOfElements--;
        return dadoRetornado;
    }

    @Override
    public Object front() {
        if (isEmpty()) {
            System.err.println("Fila vazia!");
            return null;
        }
        return data[head];
    }

    @Override
    public void startUpdate(Object item) {
        if (!isEmpty()) {
            data[head] = item;
        } else {
            System.err.println("Fila vazia!");
        }
    }

    @Override
    public void endUpdate(Object item) {
        if (!isEmpty()) {
            data[tail] = item;
        } else {
            System.err.println("Fila vazia!");
        }
    }

    @Override
    public boolean isFull() {
        return numberOfElements == data.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public String print() {
        if (isEmpty()) return "[]";
        StringBuilder resultado = new StringBuilder("[");
        int pointerAux = head;
        for (int i = 0; i < numberOfElements; i++) {
            resultado.append(data[pointerAux]);
            if (i < numberOfElements - 1) resultado.append(",");
            pointerAux = next(pointerAux);
        }
        resultado.append("]");
        return resultado.toString();
    }

    private int next(int pointer) {
        return (pointer + 1) % data.length;
    }
}
