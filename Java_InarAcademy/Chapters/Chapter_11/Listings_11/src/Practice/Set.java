package Practice;

import java.util.*;
public class Set {
    public static void main(String[] args) {
        ArrayList<Integer> lew = new ArrayList<>();
        getList(lew);
        decipher();
        clear();
        boom(lew);



    }
    public static void getList(ArrayList<Integer> lew){
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter Integers to Decipher: ");
        do{
             x = input.nextInt();
            lew.add(x);
        }while(x != 0);
    }
    public static void decipher(){
        System.out.println("OK");
        System.out.println("DECIPHERING NOW");
        for(int i = 0; i < 90000; i++){
            if(i % 2 == 0) {
                System.out.println("| O| OO|O |O|O| O|O|O| O| O|  |O|O|O | O|O |O| O|| O| O|O OO|O |O|O| O|O|O| O| O|  |O|O|O | O|O |O| O|| O| O|O | O| O | O| O |O|OO |O O | | O O| | ");
            }else if(i % 5 == 0){
                System.out.println("| O| OO|O |O|O| O|O|O| O| O|  |O|O|O | O|O |O| O|| | O| OO|O |O|O| O|O|O| O| O|  |O|O|O | O|O |O| O|| | O| OO|O |O|O| O|O|O| O| O|  |O|O|O | O|O |");
            }else{
                System.out.println("| 0 | |0|0 |0 ||0 | | 0|| | 0|  |  0| |  |  0 ||  | 00  |  ||  0|  |0 ||0 0| 0|0 | 0|  0|0 | 0| |   |0 | 0 0| | | 0|  |  0| |  |  0 ||  | 00  |  ||  0|  |0 |");
            }
        }
    }
    public static void boom(ArrayList<Integer> lew){
        //---------------------------------
        lew.clear();
        lew.add(Calendar.DECEMBER);
        lew.add(Calendar.DAY_OF_MONTH);
        lew.add(2022);

        //---------------------------------
        for(int i = 0; i < lew.size(); i++){
            System.out.println(Arrays.toString(lew.toArray()));
        }

    }
    public static void clear(){
        int count = 0;
        while(count < 100) {
            System.out.println("");
            count++;
        }
    }
}

