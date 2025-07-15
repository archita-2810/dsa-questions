import java.util.ArrayList;
import java.util.HashMap;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class topview_ofbt {
    public static void traverse(Node root, int idx, HashMap<Integer, Integer> map){}
    public static ArrayList<Integer> topView(Node root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        traverse(root, i, map);

        return arr;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        f.left = h;
        d.left = g;

        System.out.println(topView(a));
    }
}
