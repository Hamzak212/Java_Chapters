package E10;
import java.util.*;
public class MyStack extends ArrayList<Object> {

    public int getSize(){
        return size();
    }
    public void push(Object o){
        add(o);
    }

    public Object peek(){
        return get(size() - 1);
    }
    public Object pop(){
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }
    public String toString(){
        return "stack: " + toString();
    }
}
