package variant_7_9_11;

public class Main {
    public static void main(String[] args) {
        LinkedIntList a = new LinkedIntList();
        a.add(12);
        a.add(12);
        a.add(4);
        a.add(2);
        a.add(5);
        a.add(2);
        a.add(1);
        a.add(9);
        a.add(4);
        a.add(10);
        a.add(8);
        a.add(8);
        a.add(11);
        a.add(14);
        a.add(1);
        a.add(12);
        a.add(14);
        a.add(8);
        a.add(14);

        a.dublicate();
        System.out.println(a);
        a.firstLast();
        System.out.println(a);
        LinkedIntList b = new LinkedIntList();
        b.add(123);
        System.out.println(b);
    }
}
