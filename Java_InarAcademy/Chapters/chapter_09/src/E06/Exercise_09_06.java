/** (Stopwatch) Design a class named StopWatch. The class contains:
 ■ Private data fields startTime and endTime with getter methods.
 ■ A no-arg constructor that initializes startTime with the current time.
 ■ A method named start() that resets the startTime to the current time.
 ■ A method named stop() that sets the endTime to the current time.
 ■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
 Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort. */
package E06;

import com.sun.prism.impl.shape.BasicRoundRectRep;

public class Exercise_09_06 {
    public static void main(String[] args) {
        int[] Array = createAndFillArray();

        durationOfSort(Array);
    }
    public static void durationOfSort(int[] Array){
        StopWatch sort = new StopWatch();
        sort.start();
        sort(Array);
        sort.stop();
        System.out.println("The Total Elapsed Time to Sort is: " + sort.getElapsedTime() + " milliseconds!");
    }
    public static int[] createAndFillArray(){
        int[] array = new int[100000];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return array;
    }
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[i]){
                    int temp = array[j];
                    array[i] = array[j];
                    array[i] = temp;
                }
            }
        }
    }
}
