package E05;
import java.util.*;
public class Exercise_12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter Three Sides For a triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();
            try{
                Triangle t1 = new Triangle(side1, side2, side3);
                System.out.println("The Area of the Triangle is: " + t1.getArea());
                break;
            }
            catch (IllegalTriangleException ex){
                ex.printStackTrace();
            }
        }
    }
}
