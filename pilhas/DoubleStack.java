package pilhas;

public class DoubleStack implements DoubleStackOperation {
    private int topIndex1;
    private int topIndex2;
    private Object[] data;

    public DoubleStack() {
        this(12);
    }

    public DoubleStack(int length) {
        if (length <= 0) throw new IllegalArgumentException("Tamanho da pilha deve ser positivo.");
        topIndex1 = -1;
        topIndex2 = length;
        data = new Object[length];
    }

    // ================= PILHA 1 =================

    @Override
    public void push1(Object item) {
        if (isFull1()) throw new IllegalStateException("Pilha 1 está cheia!");
        data[++topIndex1] = item;
    }

    @Override
    public Object pop1() {
        if (isEmpty1()) throw new IllegalStateException("Pilha 1 está vazia!");
        return data[topIndex1--];
    }

    @Override
    public Object peek1() {
        if (isEmpty1()) throw new IllegalStateException("Pilha 1 está vazia!");
        return data[topIndex1];
    }

    public void update1(Object item) {
        if (isEmpty1()) throw new IllegalStateException("Pilha 1 está vazia!");
        data[topIndex1] = item;
    }

    public boolean isFull1() {
        return topIndex1 + 1 == topIndex2;
    }

    public boolean isEmpty1() {
        return topIndex1 == -1;
    }

    public String print1() {
        if (isEmpty1()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = topIndex1; i >= 0; i--) {
            sb.append(data[i]);
            if (i != 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // ================= PILHA 2 =================

    @Override
    public void push2(Object item) {
        if (isFull2()) throw new IllegalStateException("Pilha 2 está cheia!");
        data[--topIndex2] = item;
    }

    @Override
    public Object pop2() {
        if (isEmpty2()) throw new IllegalStateException("Pilha 2 está vazia!");
        return data[topIndex2++];
    }

    @Override
    public Object peek2() {
        if (isEmpty2()) throw new IllegalStateException("Pilha 2 está vazia!");
        return data[topIndex2];
    }

    public void update2(Object item) {
        if (isEmpty2()) throw new IllegalStateException("Pilha 2 está vazia!");
        data[topIndex2] = item;
    }

    public boolean isFull2() {
        return isFull1(); 
    }

    public boolean isEmpty2() {
        return topIndex2 == data.length;
    }

    public String print2() {
        if (isEmpty2()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = topIndex2; i < data.length; i++) {
            sb.append(data[i]);
            if (i != data.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

