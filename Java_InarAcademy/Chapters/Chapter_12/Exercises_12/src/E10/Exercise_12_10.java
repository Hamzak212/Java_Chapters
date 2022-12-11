package E10;
import java.util.*;
public class Exercise_12_10 {
    public static void main(String[] args) {
        try{
            Integer[] array = new Integer[100000 * 100000];
        }
        catch(OutOfMemoryError ex){
            System.out.println("Out Of Memory Exception Occurred.");
        }
    }
}
