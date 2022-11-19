/** (Use the Random class) Write a program that creates a Random object with seed
 1000 and displays the first 50 random integers between 0 and 100 using the
 nextInt(100) method */
package E04;

import java.util.Random;

public class Exercise_09_04 {
    public static void main(String[] args) {
        Random r = new Random(100);
        for(int i = 0; i < 50; i++){
            System.out.printf("%-3d", r.nextInt(100));
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
