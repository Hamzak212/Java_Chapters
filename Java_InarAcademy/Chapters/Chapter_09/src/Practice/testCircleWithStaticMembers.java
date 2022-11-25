package Practice;

import Practice.CircleWithStaticMembers;

public class testCircleWithStaticMembers{
    public static void main(String[] args) {
        System.out.println("Before Creating Objects: ");
        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);

        System.out.println("After Creating C1: ");

        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        System.out.println("radius (" + c1.radius + ") and number of circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");

        System.out.println("After Creating c2 and modifying c1: ");

        c1.radius = 9;
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        System.out.println("c1: radius (" + c1.radius + ") and # of circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");


        System.out.println("c2: radius (" + c2.radius + ") and # of circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
    }
}
