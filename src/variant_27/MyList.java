package variant_27;

public class MyList {

    int[] list = new int[1];
    int size = 0;

    public void append(int num){
        if (size < list.length) {
            list[size++] = num;
        } else {
            list = newList(list);
            list[size++] = num
        }
    }

    public int[] newList(int[] l){
        int[] list1 = new int[size * 2];
        if (size >= 0) System.arraycopy(list, 0, list1, 0, size);
        return list1;
    }


}
