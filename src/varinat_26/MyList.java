package varinat_26;


import java.util.ArrayList;
import java.util.LinkedList;

public class MyList {
    LinkedList<Integer> list = new LinkedList<>();

    ArrayList<Integer> a = new ArrayList<>();
    public void add(Integer num) {
        list.add(num);
    }
    public Integer peekLast() {
        return list.peekLast();
    }

    public Integer peekFirst() {
        return list.peekFirst();
    }

    public Integer pop() {
        return list.pop();
    }
}
