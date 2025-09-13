package pilhas;


public class Main {
    public static void main(String[] args) {
       
        DoubleStack pilhas = new DoubleStack(6);

        System.out.println("===== TESTE PILHA 1 =====");
        pilhas.push1("A");
        pilhas.push1("B");
        pilhas.push1("C");
        System.out.println("Pilha 1: " + pilhas.print1()); 

        System.out.println("Topo da pilha 1: " + pilhas.peek1()); 
        pilhas.update1("X");
        System.out.println("Após update: " + pilhas.print1()); 

        System.out.println("Pop da pilha 1: " + pilhas.pop1()); 
        System.out.println("Após pop: " + pilhas.print1()); 

        System.out.println("\n===== TESTE PILHA 2 =====");
        pilhas.push2(10);
        pilhas.push2(20);
        pilhas.push2(30);
        System.out.println("Pilha 2: " + pilhas.print2()); 

        System.out.println("Topo da pilha 2: " + pilhas.peek2());
        pilhas.update2(99);
        System.out.println("Após update: " + pilhas.print2()); 

        System.out.println("Pop da pilha 2: " + pilhas.pop2());
        System.out.println("Após pop: " + pilhas.print2());

        System.out.println("\n===== TESTE ERROS =====");
        try {
            pilhas.pop1(); 
            pilhas.pop1(); 
            pilhas.pop1(); 
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }

        try {
            pilhas.pop2(); 
            pilhas.pop2(); 
            pilhas.pop2();
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }
}
