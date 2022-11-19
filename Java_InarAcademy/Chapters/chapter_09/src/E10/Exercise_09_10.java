package E10;
import java.util.*;

public class Exercise_09_10 {
    public static void main(String[] args) {


        QuadraticEquation values = getValues();

        display(values);


    }

    private static void display(QuadraticEquation values) {
        if (values.getRoot1() == 0){
            System.out.println("The equation has no root");
        }else if(values.getRoot1() == values.getRoot2()){
            System.out.println("The equation has a root " + values.getRoot1());
        }else
            System.out.println("The equation has two roots " +
                    values.getRoot1() + " and " + values.getRoot2());
    }

    public static QuadraticEquation getValues(){
        Scanner input = new Scanner(System.in);
        System.out.println("- - Quadratic Equation Discriminant - -");
        System.out.println("Enter a: ");
        double a = input.nextInt();
        System.out.println("Enter b: ");
        double b = input.nextInt();
        System.out.println("Enter c: ");
        double c = input.nextInt();
        QuadraticEquation values = new QuadraticEquation(a,b,c);
        return values;
    }
}
