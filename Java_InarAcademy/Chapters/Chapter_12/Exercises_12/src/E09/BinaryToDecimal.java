package E09;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("1) Binary to Decimal Converter \n2) Decimal to Binary Converter \n3) Quit Program ");
            System.out.print("Enter request => ");
            int request = input.nextInt();
            if(request == 1){
                b2d();
            }else if(request == 2){
                decimalToBinary();
            }else if(request == 3){
                System.out.println("Good Bye!");
                System.exit(1);
            }
        }
    }
    public static void decimalToBinary(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter a decimal number: ");
            int s = input.nextInt();
            try{
                d2b(s);
                break;
            }
            catch (Exception ex){
                System.out.println("Input is not a decimal number.");
            }
        }
    }
    public static void d2b(int s) throws BinaryFormatException {


        int[] binary = new int[35];
        int id = 0;
        while(s > 0){
            binary[id++] = s % 2;
            s = s / 2;
        }
        for (int i = id - 1; i >= 0; i--) {
            System.out.print(binary[i] + "");
        }
        System.out.println("\n\n\n\n\n\n\n");

    }
    static String reverse(String input)
    {
        char[] a = input.toCharArray();
        int l, r = 0;
        r = a.length - 1;

        for (l = 0; l < r; l++, r--) {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }

    public static int binary2Decimal(String s) throws BinaryFormatException {
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != '0' && c != '1'){
                throw new BinaryFormatException("Input is not a binary number.");
            }
        }
        int sum = 0;
        int multipleOfTwo = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                sum += multipleOfTwo;
            }
            multipleOfTwo *= 2;
        }

        return sum;
    }
    public static void b2d(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter a binary number: ");
            String s = input.nextLine();
            try{
                System.out.println(s + "'s decimal value is: " + binary2Decimal(s) + "\n\n\n\n\n\n\n\n");
                break;
            }
            catch (Exception ex){
                System.out.println("Input is not a binary number.");
            }
        }
    }
}
