package E01;
import java.util.*;
public class Exercise_11_01{
    public static void main(String[] args) {
        Triangle t1 = getFromUser();
        System.out.println(t1.toString());
        System.out.println("\nArea: " + t1.getArea() + "\nPerimeter: " + t1.getPerimeter() +
                "\nColor: " + t1.getColor() + "\nFilled? " + t1.isFilled());

    }
    public static Triangle getFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color of the triangle: ");
        String color = input.next();

        System.out.println("Filled or Not Filled (true/false): ");
        boolean filled = input.nextBoolean();
        Triangle t1 = new Triangle(side1,side2,side3);
        t1.setColor(color);
        t1.setFilled(filled);
        return t1;
    }
}
