package variant_3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "l");
        map.put("b", "g");
        map.put("v", "a");
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(HashMap<String, String> map) {

        for (String val1: map.values()) {
            int count = 0;
            for (String val2: map.values()) {
                if (val1.equals(val2)) {
                    count += 1;
                    if (count > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
