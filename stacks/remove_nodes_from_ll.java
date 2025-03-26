import java.util.Stack;

public class remove_nodes_from_ll {
    public static Node removeNodes(Node head) {
        Node temp = head;
        Stack<Node> sh = new Stack<>();
        while (temp != null) {
            while (!sh.isEmpty() && sh.peek().val < temp.val) {
                sh.pop();
            }
            sh.push(temp);
            temp = temp.next;
        }
        
        Node prev = null;
        while (!sh.isEmpty()) {
            Node node = sh.pop();
            node.next = prev;
            prev = node;
        }
        return prev;
    }
    public static int getSize(Node head){
        Node dummy = head;
        int size = 0;
        while(dummy != null){
            dummy = dummy.next;
            size++;
        }

        return size;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(13);
        Node d = new Node(3);
        Node e = new Node(8);
        a.next = b; b.next = c;
        c.next = d; d.next = e;

        Node temp = removeNodes(a);
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
