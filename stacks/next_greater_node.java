import java.util.Stack;

class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class Pair<K, V> {
    K first;
    V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() { return first; }
    public V getSecond() { return second; }
}

public class next_greater_node {
    public static int[] nextLargerNodes(Node head) {
        int n = getSize(head);
        int answer[] = new int[n];
        Stack<Pair<Integer, Integer>> sh = new Stack<>();
        Node temp = head;
        answer[n-1] = 0;
        for(int i = 0; i < n; i++){
            while(!sh.isEmpty() && temp.val > sh.peek().getSecond()){
                answer[sh.peek().getFirst()] = temp.val;
                sh.pop();
                // sh.push(new Pair<>(i, temp.val));
            }
            sh.push(new Pair<>(i, temp.val));
            temp = temp.next;
        }

        return answer;
    }
    public static int getSize(Node head) {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }    
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(7);
        Node c = new Node(4);
        Node d = new Node(3);
        Node e = new Node(5);
        a.next = b; b.next = c;
        c.next = d; d.next = e;

        int result[] = nextLargerNodes(a);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
