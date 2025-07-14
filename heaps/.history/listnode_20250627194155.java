import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class listnode {
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode node : lists) {
        if (node != null) {
            pq.add(node);
        }
    }

        ListNode temp = pq.remove();
        while (!pq.isEmpty()) {
            ListNode temp2 = pq.remove();
            temp.next = temp2;
        }

        return temp;
    }

    public static void main(String[] args) {

    }
}
