package varian_6;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
    }

    public static void guavaSort(String[] ar) {
        Map<String, Integer> ms = new TreeMap<>();
        int j = 0, i = 0;
        for (var word: ar) {
            if (!ms.containsKey(word)) {
                ms.put(word, 1);
            } else {
                ms.put(word,ms.get(word) + 1);
            }
        }

        for (var key: ms.entrySet()) {
            for (i = j; i < key.getValue() + j; i++) {
                ar[i] = key.getKey();
            }
            j = i;
        }
    }
}
