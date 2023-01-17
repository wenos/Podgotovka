package variant_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(13, "a");
        map.put(112, "a");
        map.put(114, "b");
        System.out.println(reverse(map));
    }

    public static HashMap<String, Integer> reverse(HashMap<Integer, String> map){
        HashMap<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }
}
