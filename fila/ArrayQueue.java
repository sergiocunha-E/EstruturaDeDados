package fila;

public class ArrayQueue implements Queueble {

    private Object[] data;
    private int head;
    private int tail;

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int length) {
        if (length <= 0) throw new IllegalArgumentException("Tamanho da fila deve ser positivo!");
        this.data = new Object[length];
        this.head = 0;
        this.tail = -1;
    }

    @Override
    public void enqueue(Object item) {
        if (isFull()) {
            System.err.println("Queue is full!");
            return;
        }
        tail++;
        data[tail] = item;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is empty!");
            return null;
        }
        Object aux = data[head];
        head++;
        return aux;
    }

    @Override
    public Object front() {
        if (isEmpty()) {
            System.err.println("Queue is empty!");
            return null;
        }
        return data[head];
    }

    @Override
    public boolean isEmpty() {
        return head > tail;
    }

    @Override
    public boolean isFull() {
        return tail == data.length - 1;
    }

    @Override
    public String print() {
        if (isEmpty()) return "[]";
        StringBuilder result = new StringBuilder("[");
        for (int i = head; i <= tail; i++) {
            result.append(data[i]);
            if (i < tail) result.append(", ");
        }
        result.append("]");
        return result.toString();
    }
}
