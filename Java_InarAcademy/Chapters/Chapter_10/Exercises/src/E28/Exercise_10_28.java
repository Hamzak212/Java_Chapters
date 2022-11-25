package E28;
import java.util.*;
public class Exercise_10_28 {
    public static void main(String[] args) {
        MyStringBuilder2 a = new MyStringBuilder2();
        System.out.println(a);
        MyStringBuilder2 b = new MyStringBuilder2(new char[]{'h', 'a', 'p'});
        System.out.println(b);
        MyStringBuilder2 c = new MyStringBuilder2("birthday");
        System.out.println(c);
        c.insert(3, new MyStringBuilder2("GIFT"));
        System.out.println(c);
        c.reverse();
        System.out.println(c);
        MyStringBuilder2 d = c.substring(3);
        System.out.println(d);
        d.toUpperCase();
        System.out.println(d);
    }
}
