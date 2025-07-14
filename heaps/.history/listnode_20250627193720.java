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
        PriorityQueue<ListNode> pq = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            pq.add(lists[i]);
        }

        ListNode temp = pq.remove();
        while(pq.isEmpty()){
            
        }
    }
    public static void main(String[] args) {

    }
}
