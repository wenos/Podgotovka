package variant_25;

import java.net.Inet4Address;
import java.util.LinkedList;

public class MyStack {
    private LinkedList<Integer> stack = new LinkedList<>();

    public void add(Integer num){
        stack.add(num);
    }

    public Integer peek() {
        return stack.peekLast();
    }

    public void pop(){
        stack.pollLast();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
