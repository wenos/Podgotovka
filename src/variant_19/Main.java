package variant_19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(8);
        q.add(7);
        q.add(2);
        q.add(9);
        q.add(18);
        q.add(12);
        System.out.println(q);
        reverseHalf(q);
        System.out.println(q);
    }
    public static void reverseHalf(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; ++i){
            if (i % 2 == 0) {
                q.add(q.poll());
            } else {
                s.push(q.poll());
            }
        }
        size = q.size();
        for (int i = 0; i < size; ++i){
            q.add(q.poll());
            if (!s.empty()) {
                q.add(s.peek());
                s.pop();
            }
        }
    }

}
