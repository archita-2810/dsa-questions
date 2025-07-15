import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class random_pointer {
    public static Node copyRandomList(Node head) {
        Node head2 = new Node(head.val);
        Node temp2 = head2;
        Node temp = head.next;
        while(temp!= null){
            Node dup = new Node(temp.val);
            temp2.next = dup;
            temp2 = dup;
            temp = temp.next;
        }

        HashMap<Node, Node> map = new HashMap<>();
        Node temp2 = head2;
        Node temp = head;

        
    }
    public static void main(String[] args) {
        
    }
}
