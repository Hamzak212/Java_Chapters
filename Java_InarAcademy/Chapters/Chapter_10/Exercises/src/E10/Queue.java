package E10;

import javax.xml.bind.Element;

public class Queue {
    private int[] elements;
    private int size;

    public Queue(){
        elements = new int[8];
        size = 0;
    }

    public int dequeue(){
        int n = elements[0];

        for(int i = 1; i < size; i++){
            elements[i - 1] = elements[i];
        }
        size--;
        return n;
    }

    public void enqueue(int v){

        if(size >= elements.length){
            int[] tempElements = new int[elements.length * 2];
            System.arraycopy(elements, 0 , tempElements, 0, elements.length);
            elements = tempElements;
        }

        elements[size] = v;
        size++;
    }

    private static int[] tempElements(int[] tempLength) {
        return tempLength;
    }

    public int getSize(){
        return size;
    }
    public boolean empty(){
        return size == 0;
    }
}
