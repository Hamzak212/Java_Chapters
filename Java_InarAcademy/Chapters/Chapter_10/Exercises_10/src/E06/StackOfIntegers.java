package E06;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    //constructor for default capacity 16
    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }

    //specified maximum capacity, if they want 100 primes, it makes it 100 capacity.
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    //pushes/puts integer into stack 1 by 1
    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    //peek at top of Stack. NO REMOVING
    public int peek(){
        return elements[size - 1];
    }

    //return and remove top of stack
    public int pop(){
        return elements[--size];
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

}
