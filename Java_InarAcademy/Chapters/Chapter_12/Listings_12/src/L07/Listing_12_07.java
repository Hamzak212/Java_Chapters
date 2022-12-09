package L07;

public class Listing_12_07 {
    public static void main(String[] args) {
        CircleWithException circle1 = new CircleWithException();
        circle1.setRadius(2);
        CircleWithException circle2 = new CircleWithException(1);
        CircleWithException circle3 = new CircleWithException();
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println(circle1.getNumberOfObjects());
        System.out.println(circle2.getNumberOfObjects());
        System.out.println(circle3.getNumberOfObjects());
    }
}
