package E22;
import java.util.*;
public class Exercise_10_22 {
    public static void main(String[] args) {
        MyString1 a = new MyString1(new char[]{'H', 'A', 'P', 'P', 'Y'});
        System.out.println(a.toString());
        MyString1 b = a.toLowerCase();
        System.out.println(b);
        MyString1 c = b.substring(0, 3);
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(a.equals(b));
        MyString1 d = new MyString1(new char[]{'H', 'A', 'P', 'P', 'Y'});
        System.out.println(a.equals(d));
        MyString1 e = MyString1.valueOf(71367);
        System.out.println(e);
    }
}
