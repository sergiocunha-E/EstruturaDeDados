package Stack_Dinamica;

import java.util.NoSuchElementException;

/**
 * Implementação de uma Pilha Dinâmica Genérica 
 * 
 */
public class LinkedStack<T> implements Stackable {

    /** Aponta para o topo da pilha. */
    private DoubleNode <T> topPointer;
    /** Indica o número atual de dados da pilha. */
    private int numberElements;
    /** Indica o número máximo de elementos que a pilha pode possuir. */
    private int maxElements;


    /** 
    * Construtor que não recebe nada e por padrão cria uma pilha com 10 posições
    */

    public LinkedStack() {
        this(10);
    }

    /** 
    * Construtor que recebe um inteiro
    *
    *
    *@param maxElements, contém o número maximo de elementos
    */
    public LinkedStack (int maxElements){
        topPointer = null;
        numberElements = 0;
        this.maxElements = maxElements;
   
    }

    /** 
    * verifica se a pilha está vazia
    *
    *
    *@return retorna True se a pilha estiver vazia
    *
    *
    */


    @Override
    boolean isEmpty() {
        return numberElements == 0; 

    }

    
    boolean isFull(){
        return numberElements == maxElements;
    }


    @Override
    public T peek() throws RuntimeException{
        if(!isEmpty()) {
            throw  new NoSuchElementException("Stack is empty!");
        } 
        return topPointer.getData();
    }

    public T pop() throws RuntimeException{
        if(!isEmpty()){
            throw new NoSuchElementException("Stack is empty!");
        }
        T auxData = topPointer.getData();
        numberElements--;
        topPointer = topPointer.getPrevious();
        topPointer.setNext(null);
        return auxData;
    }

    void push(T data);
    void update(T newData);

    boolean isFull();
    boolean isEmpty();
    String print();
    
    
}
