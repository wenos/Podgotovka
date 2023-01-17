package variant_7_9;

public class LinkedIntList {
    private ListNode front = null;

    public void add(int a){
        ListNode x = new ListNode(a);
        x.next = front;
        front = x;
    }

    public void pop() {
        front = front.next;
    }

    public void delit(int num) {
        if (front.data == num) {
            pop();
            return;
        }
        ListNode tmp = front.next;
        ListNode prew = front;
        while (tmp != null) {
            if (tmp.data == num) {
                prew.next = tmp.next;
            }
            tmp = tmp.next;
            prew = prew.next;
        }
    }

    public void removeAll(LinkedIntList b) {
        ListNode list1 = front;
        ListNode list2 = b.front;
        while (list1 != null && list2 != null) {
            if (list1.data == list2.data) {
                delit(list1.data);
                list1 = front;
            } else if (list1.data > list2.data) {
                list2 = list2.next;
            } else {
                list1 = list1.next;
            }
        }
    }

    public void dublicate() {
        ListNode tmp = front;
        while (tmp != null) {
            ListNode tmp1 = tmp.next;
            ListNode prew = tmp;
            while (tmp1 != null) {
                if (tmp.data == tmp1.data) {
                    prew.next = tmp1.next;
                    tmp1 = tmp1.next;
                } else {
                    tmp1 = tmp1.next;
                    prew = prew.next;
                }
            }
            tmp = tmp.next;
        }
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(" ");
        ListNode tmp = front;
        while (tmp != null){
            s.append(tmp.data);
            s.append(" ");
            tmp = tmp.next;
        }
        return s.toString();
    }
}
