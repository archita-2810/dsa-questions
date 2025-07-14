class Node {
    Node node;
    int val;
    Node left;
    Node right;

    public Node(int val) {
        // this.node = node;
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class binarytree_maxheap_check {
    public static boolean hop(Node root) {
        if (root == null)
            return true;
        if (root.left != null) {
            if (root.val < root.left.val)
                return false;
        }
        if (root.right != null) {
            if (root.val < root.right.val)
                return false;
        }
        return hop(root.left) && hop(root.right);
    }

    public static boolean cbt(Node root, int var, int size) {
        if(root == null) return true;

        return false;
    }

    public static boolean isHeap(Node tree) {
        return hop(tree) && cbt(tree,0, size(tree));
    }

    public static int size(Node tree) {
        return 1 + s
    }

    public static void main(String[] args) {
        Node a = new Node(97);
        Node b = new Node(46);
        Node c = new Node(37);
        Node d = new Node(12);
        Node e = new Node(3);
        Node f = new Node(7);
        Node g = new Node(31);
        Node h = new Node(6);
        Node i = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        g.right = i;

    }
}
