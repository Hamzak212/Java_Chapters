package E13;
import java.util.*;
public class Exercise_09_13 {
    public static void main(String[] args) {

        double[][] matrix = getInput();
        Location largest = locateLargest(matrix);
        System.out.println(largest.toString());
    }
    public static Location locateLargest(double[][] m){
        double max_value = 0;
        int row = -1;
        int column = -1;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] > max_value){
                    max_value = m[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new Location(row, column, max_value);
    }
    public static double[][] getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] matrix = new double[rows][columns];

        System.out.println("Enter Array: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}
