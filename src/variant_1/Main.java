package variant_1;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list2.add(2);
        list2.add(4);
        Integer a  = 0;
        System.out.println(list1.getClass());
        System.out.println(alternate(list1, list2));
    }

    public static LinkedList<Integer> alternate(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();
        boolean flag = true;
        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it2 = list2.iterator();
        while (it1.hasNext() || it2.hasNext()) {
            Integer a;
            if (flag) {
                if (it1.hasNext()) {
                    a = it1.next();
                    flag = false;
                } else {
                    a = it2.next();
                }
            } else {
                if (it2.hasNext()) {
                    a = it2.next();
                    flag = true;
                } else {
                    a = it1.next();
                }
            }
            result.add(a);
        }
        return result;
    }
}

