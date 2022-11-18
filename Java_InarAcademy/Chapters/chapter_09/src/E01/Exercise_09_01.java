/** (The Rectangle class) Following the example of the Circle class in Section 9.2,
 design a class named Rectangle to represent a rectangle. The class contains:
 ■ Two double data fields named width and height that specify the width and
 height of the rectangle. The default values are 1 for both width and height.
 ■ A no-arg constructor that creates a default rectangle.
 ■ A constructor that creates a rectangle with the specified width and height.
 ■ A method named getArea() that returns the area of this rectangle.
 ■ A method named getPerimeter() that returns the perimeter.
 Draw the UML diagram for the class and then implement the class. Write a test
 program that creates two Rectangle objects—one with width 4 and height 40
 and the other with width 3.5 and height 35.9. Display the width, height, area,
 and perimeter of each rectangle in this order. */
package E01;

public class Exercise_09_01 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Width of r1: " + r1.width + "\nHeight of r1: " + r1.height +
                "\nArea of r1: " + r1.getArea() + "\nPerimeter of r1: " + r1.getPerimeter());

        System.out.println("Width of r2: " + r2.width + "\nHeight of r2: " + r2.height +
                "\nArea of r2: " + r2.getArea() + "\nPerimeter of r2: " + r2.getPerimeter());
    }
}
