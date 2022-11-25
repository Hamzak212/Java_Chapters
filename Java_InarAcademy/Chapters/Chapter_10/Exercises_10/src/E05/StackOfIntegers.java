package E05;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    private static final int CAPACITY = 16;

    public StackOfIntegers(){
        this(CAPACITY);
    }

    public StackOfIntegers(int CAPACITY){
        elements = new int[CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public boolean empty(){
        return size == 0;
    }

    public int peek(){
        return elements[size - 1];
    }

    public int pop(){
        return elements[--size];
    }

    public void push(int value){
        if(size > elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

}
