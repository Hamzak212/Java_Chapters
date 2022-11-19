package E11;
import java.util.*;
public class Exercise_09_11 {
    public static void main(String[] args) {
        LinearEquation values = getInput();
        display(values);
    }
    public static void display(LinearEquation values){
        if (values.isSolvable()) {
            System.out.println("For the equation x is " +
                    values.getX() + " and y is " + values.getY());
        } else
            System.out.println("The equation has no root");
    }
    public static LinearEquation getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, and f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation values = new LinearEquation(a,b,c,d,e,f);
        return values;
    }

}
