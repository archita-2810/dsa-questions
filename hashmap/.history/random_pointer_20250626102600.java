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
        
    }
    public static void main(String[] args) {
        
    }
}
