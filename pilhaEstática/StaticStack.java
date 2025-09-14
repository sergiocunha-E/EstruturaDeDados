package pilhaEstática;

public class StaticStack implements StackOperations {
    private int topIndex;
    private final Object[] data;

    public StaticStack() {
        this(12);
    }

    public StaticStack(int length) {
        if (length <= 0) throw new IllegalArgumentException("O tamanho da pilha deve ser positivo!");
        this.topIndex = -1;
        this.data = new Object[length];
    }

    @Override
    public void push(Object item) {
        if (isFull()) {
            System.err.println("A pilha está cheia!");
            return;
        }
        data[++topIndex] = item;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            System.err.println("A pilha está vazia!");
            return null;
        }
        Object topData = data[topIndex];
        data[topIndex--] = null; // libera a posição
        return topData;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            System.err.println("A pilha está vazia!");
            return null;
        }
        return data[topIndex];
    }

    @Override
    public void update(Object item) {
        if (isEmpty()) {
            System.err.println("A pilha está vazia!");
            return;
        }
        data[topIndex] = item;
    }

    @Override
    public boolean isFull() {
        return topIndex == data.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public String print() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = topIndex; i >= 0; i--) {
            sb.append(data[i]);
            if (i > 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
