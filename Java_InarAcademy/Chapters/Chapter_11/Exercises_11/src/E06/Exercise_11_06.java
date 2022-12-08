package E06;
import java.util.*;

public class Exercise_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Date());
        list.add("rip");

        for (Object o : list) {
            System.out.println(o);
            System.out.println("-------");
        }
    }
}
