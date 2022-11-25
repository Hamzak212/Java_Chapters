package E22;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars){
        this.chars = chars;
    }

    public char charAt(int index){
        return chars[index];
    }

    public int length(){
        return chars.length;
    }

    public MyString1 substring(int first, int last){
        if(first > last || first < 0 || last > length()){
            System.out.println("Invalid substring parameters!");
            System.exit(1);
        }

        char[] c = new char[first - last];

        for(int indexChars = first, indexC = 0;indexChars < last; indexChars++, indexC++) {
            c[indexC] = chars[indexChars];
        }
        return new MyString1(c);

    }
    public MyString1 toLowerCase(){
        char[] c = new char[chars.length];

        for(int i = 0; i < chars.length; i++){
            char ch = chars[i];
            if ('Z' >= ch && ch >= 'A') {
                c[i] = (char) (chars[i] + ('a' - 'A'));
            } else {
                c[i] = chars[i];
            }

        }
        return new MyString1(c);

    }
    public boolean equals(MyString1 s) {
        if (s.length() != chars.length) {
            return false;
        }

        for (int index = 0; index < chars.length; index++) {
            if (s.charAt(index) != charAt(index)) {
                return false;
            }
        }

        return true;
    }
    public static MyString1 valueOf(int i) {
        int countTheDigits = 0;
        int number = i;

        while (number > 0) {
            number /= 10;
            countTheDigits++;
        }

        char[] ch = new char[countTheDigits];

        for (int index = countTheDigits - 1; index >= 0; index--) {
            ch[index] = (char) ('0' + (i % 10));
            i /= 10;
        }

        return new MyString1(ch);
    }
}
