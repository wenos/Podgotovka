package variant_18;

public class ArrayIntList {
    private final int[] elementData;

    ArrayIntList(int[] ar) {
        int size = ar.length;
        elementData = new int[size];
        System.arraycopy(ar, 0, elementData, 0, size);

    }

    public void append(int index, int num) {
        elementData[index] = num;
    }

    public int longestSortedSequence() {
        if (elementData.length == 0) {
            return 0;
        }
        int count = 1;
        int maxim = 1;
        for (int i = 0; i < elementData.length - 1; ++i) {
            if (elementData[i] < elementData[i + 1]) {
                ++count;
                maxim = Math.max(count, maxim);
            } else {
                count = 1;
            }
        }
        return maxim;
    }

}

