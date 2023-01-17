package variant_15;

import java.util.*;

public class Solution {
    public static Stack<Integer> _15_splitStackQueue(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        while (!stack.empty()) {
            Integer a = stack.peek();
            stack.pop();
            ++count;
            queue.add(a);
            int i = 0;
            if (a < 0) {
                while (i++ < count && queue.peek() < 0) {
                    queue.add(queue.peek());
                    queue.remove();
                }
                while (queue.peek() >= 0) {
                    queue.add(queue.peek());
                    queue.remove();
                }
            }
        }
        while (!(queue.isEmpty())) {
            stack.push(queue.peek());
            queue.remove();
        }
        return stack;
    }


    public static Stack<Integer> _15_splitStackDeque(Stack<Integer> stack) {
        Deque<Integer> deque = new LinkedList<>();
        while (!stack.empty()) {
            Integer a = stack.peek();
            stack.pop();
            if (a < 0) {
                deque.addFirst(a);
            } else {
                deque.addLast(a);
            }
        }
        while (!(deque.isEmpty())) {
            stack.push(deque.peek());
            deque.remove();
        }
        return stack;
    }

}
