package E03;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven(){
        return getValue() % 2 == 0;
    }

    public boolean isOdd(){
        return getValue() % 2 == 1;
    }
    public boolean isPrime(){

        int value = getValue();

        int k = 0;
        for(int i = 2; i < getValue(); i++){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }
}
