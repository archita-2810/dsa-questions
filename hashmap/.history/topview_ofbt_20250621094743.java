import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Pair {
    Node node;
    int level;

    Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}

public class topview_ofbt {
    public static void traverse(Node root, HashMap<Integer, Integer> map) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair current = q.poll();
            Node temp = current.node;
            int level = current.level;
            if (!map.containsKey(level))
                map.put(level, temp.val);
            if (temp.left != null)
                q.offer(new Pair(temp.left, level - 1));
            if (temp.right != null)
                q.offer(new Pair(temp.right, level + 1));
        }
    }

    public static ArrayList<Integer> topView(Node root) {
        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        ArrayList<Integer> result = new ArrayList<>();
        for (int key : sortedKeys) {
            result.add(map.get(key));
        }

        return result;
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

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        f.left = h;
        d.left = g;

        ArrayList<Integer> arr = topView(a);
        for(int i = 0; i < arr.size(); i++){
            System.out.println();
        }
    }
}
