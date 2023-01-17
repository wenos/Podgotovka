package variant_15;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-98);
        stack.push(-12);
        stack.push(23);
        stack.push(23);
        stack.push(23);

        stack.push(-12);
        stack.push(-12);
        stack.push(0);

        stack.push(-12);
        stack.push(112312);

        stack.push(-199);
        System.out.println(Solution._15_splitStackQueue(stack));

        System.out.println(Solution._15_splitStackDeque(stack));
    }
}








