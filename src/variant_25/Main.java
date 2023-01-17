package variant_25;

public class Main {
    public static void main(String[] args) {
        MyStack a = new MyStack();
        a.add(1232);
        a.add(123);
        a.add(123);
        a.add(123);
        a.add(1);
        System.out.println(a);
        a.pop();
        System.out.println(a);
        System.out.println(a.peek());

    }
}
