package variant_14;

import java.util.Objects;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        a.push(1);
        a.push(1);
        a.push(4);
        a.push(3);

        b.push(1);
        b.push(1);
        b.push(3);
        b.push(4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(equals(a, b));
    }
    public static boolean equals(Stack<Integer> a, Stack<Integer> b) {
        Stack<Integer> tmp = new Stack<>();
        while (!a.empty() && !b.empty()) {
            if (!a.peek().equals(b.peek())) {
                break;
            } else {
                tmp.push(a.peek());
                a.pop();
                b.pop();
            }
        }
        boolean fl = a.empty() && b.empty();
        while (!tmp.empty()) {
            a.push(tmp.peek());
            b.push(tmp.peek());
            tmp.pop();
        }
        System.out.println(a);
        System.out.println(b);
        return fl;
    }
}