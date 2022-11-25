package E14;

import java.util.GregorianCalendar;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(){
        this(System.currentTimeMillis());
    }
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(long elapsedTime){
        this(calender(elapsedTime).get(GregorianCalendar.YEAR),
                calender(elapsedTime).get(GregorianCalendar.MONTH),
                calender(elapsedTime).get(GregorianCalendar.DAY_OF_MONTH));
    }

    public static GregorianCalendar calender(long elapsedTime){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        return cal;
    }

    public int getDay(){
    return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }
    public void setDate(long elapsedTime) {
        GregorianCalendar newDate = calender(elapsedTime);
        year = newDate.get(GregorianCalendar.YEAR);
        month = newDate.get(GregorianCalendar.MONTH);
        day = newDate.get(GregorianCalendar.DAY_OF_MONTH);
    }

}
