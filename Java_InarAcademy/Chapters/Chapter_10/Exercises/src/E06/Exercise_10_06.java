/** (Displaying the prime numbers) Write a program that displays all the prime
 numbers less than 120 in decreasing order. Use the StackOfIntegers class
 to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
 reverse order. */
package E06;

public class Exercise_10_06 {
    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();

        for(int i = 2; i <= 120; i++){
            if(isPrime(i))
                stack.push(i);
        }

        System.out.println("All the numbers less than 120 that are prime:");
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

    }
    public static boolean isPrime(int i){
        for(int d = 2; d <= i / 2; d++){
            if(i % d == 0){
                return false;
            }
        }
        return true;
    }
}
