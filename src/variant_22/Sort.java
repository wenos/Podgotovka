package variant_22;

import java.util.Arrays;

public class Sort<T> {
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; ++j) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}