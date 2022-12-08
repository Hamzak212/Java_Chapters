package E09;
import java.util.*;
public class Exercise_11_09 {
    public static void main(String[] args) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        int[][] matrix = fillRandomly();
        displayMatrix(matrix);
        int rowCount = getRow(matrix);
        int colCount = getCol(matrix);
        display(rowCount, colCount);
    }
    public static void display(int rowCount, int colCount){
        if(rowCount == 0){
            System.out.println("Row Count is 0.");
        }else{
            System.out.println("Row Count is " + rowCount + ".");
        }

        if(colCount == 0){
            System.out.println("Col Count is 0.");
        }else{
            System.out.println("Col Count is " + colCount + ".");
        }
    }
    public static int getCol(int[][] matrix){
        int count;
        int maxCount = 0;
        for (int row = 0; row < matrix.length; row++) {
                count = 0;
            for (int col = 0; col < matrix.length; col++) {
                if(matrix[col][row] == 1){
                    count++;
                }
                if(count > maxCount){
                    maxCount = count;
                }
            }

        }
        return maxCount;
    }
    public static int getRow(int[][] matrix){
        int count;
        int maxCount = 0;

        for(int row = 0; row < matrix.length; row++){
            count = 0;
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] == 1){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
    public static void displayMatrix(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
    public static int[][] fillRandomly(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        for(int r = 0; r < size; r++){
            for(int c = 0; c < size; c++){
                matrix[r][c] = (int)(Math.random() * 2);
            }
        }
        return matrix;
    }
}
