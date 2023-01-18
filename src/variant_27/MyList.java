package variant_27;

import java.util.ArrayList;

public class MyList {

    int[] list = new int[1];
    int size = 0;

    public void append(int num){

        if (size == list.length) {
            list = newList(list);
        }
        list[size++] = num;
    }

    public int[] newList(int[] l){
        int[] list1 = new int[size * 2];
        if (size >= 0) System.arraycopy(list, 0, list1, 0, size);
        return list1;
    }

    public void popLeft(){
        for (int i = 0; i < size; ++i){

        }
    }

}
