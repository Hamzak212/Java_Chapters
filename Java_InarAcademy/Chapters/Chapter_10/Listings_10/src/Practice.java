public class Practice {
    public static void main(String[] args) {


        int value = 4;

        System.out.println(isPrime(value));
    }
    public static boolean isPrime(int value){

        int newValue = value;

        int k = 0;
        for(int i = 2; i < newValue; i++){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }
}
