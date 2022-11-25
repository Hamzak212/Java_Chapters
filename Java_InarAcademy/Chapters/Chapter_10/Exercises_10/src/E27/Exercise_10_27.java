package E27;
import java.util.*;
public class Exercise_10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 a = new MyStringBuilder1("Happy");
        System.out.println(a);
        System.out.println(a.charAt(3));
        System.out.println(a.toLowerCase());
        a.append(new MyStringBuilder1(" Birthday"));
        System.out.println(a);
        MyStringBuilder1 b = a.substring(3,7);
        System.out.println(b);
    }
}
