package Practice;

import java.util.*;
public class TestSimpleCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        int radius1 = input.nextInt();
        SimpleCircle circle1 = new SimpleCircle(radius1);

        System.out.println("The area of radius " + circle1.radius + " is " + circle1.getArea());

        System.out.println("Enter Radius: ");
        int radius2 = input.nextInt();
        SimpleCircle circle2 = new SimpleCircle(radius2);

        System.out.println("The area of radius " + circle2.radius + " is " + circle2.getArea());

        System.out.println("Enter Radius: ");
        int radius3 = input.nextInt();
        SimpleCircle circle3 = new SimpleCircle(radius3);

        System.out.println("The area of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of radius " + circle2.radius + " is " + circle2.getArea());



    }
}
class SimpleCircle{

    double radius;
    SimpleCircle(int userRadius){
        radius = userRadius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
}