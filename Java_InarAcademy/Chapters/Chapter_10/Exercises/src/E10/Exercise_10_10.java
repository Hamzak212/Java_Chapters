package E10;

public class Exercise_10_10 {
    public static void main(String[] args) {

        Queue elements = new Queue();
        for(int i = 1; i <= 20; i++){
            elements.enqueue(i);
        }
        int size = elements.getSize();

        for(int i = 1; i <= size; i++){
            System.out.print(elements.dequeue() + " ");
        }



    }
}
