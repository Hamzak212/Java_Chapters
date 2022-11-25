package E01;
import java.util.*;
public class Exercise_10_01 {
    public static void main(String[] args) {
            Time time1 = new Time();
            Time time2 = new Time(555550000);



            displayTime(time1);
            displayTime(time2);


    }
    public static void displayTime(Time t){
        System.out.println((t.getHour() < 10? "0" + t.getHour() : t.getHour()) + ":" +
                (t.getMinute() < 10 ? "0" + t.getMinute() : t.getMinute()) + ":" +
                (t.getSecond() < 10 ? "0" + t.getSecond() : t.getSecond()));

    }
}
