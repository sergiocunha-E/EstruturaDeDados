package pilhaInvertida;

public class InvertedPilha implements InvertedStackOperations {
    private int topIndex;
    private final Object[] data;

    public InvertedPilha() {
        this(12);
    }

    public InvertedPilha(int length) {
        if (length <= 0) throw new IllegalArgumentException("O tamanho da pilha deve ser positivo!");
        topIndex = length;
        data = new Object[length];
    }

    @Override
    public void push(Object item) {
        if (!isFull()) {
            topIndex--;
            data[topIndex] = item;
        } else {
            System.err.println("A pilha está cheia!");
        }
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            System.err.println("A pilha está vazia!");
            return null;
        }
        Object topData = data[topIndex];
        data[topIndex] = null; // limpa a referência (boa prática)
        topIndex++;
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
        } else {
            data[topIndex] = item;
        }
    }

    @Override
    public boolean isFull() {
        return topIndex == 0;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == data.length;
    }

    @Override
    public String print() {
        if (isEmpty()) return "[]";
        StringBuilder resultado = new StringBuilder("[");
        for (int i = topIndex; i < data.length; i++) {
            resultado.append(data[i]);
            if (i < data.length - 1 && data[i + 1] != null) resultado.append(", ");
        }
        resultado.append("]");
        return resultado.toString();
    }
}
