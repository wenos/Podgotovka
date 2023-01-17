package varinat_4;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println(isOdd(set));
    }

    public static boolean isOdd(HashSet<Integer> set) {
        for (Integer n: set) {
            if (n % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
