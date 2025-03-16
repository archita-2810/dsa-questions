
public class linkedlist_implementation_of_stack {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static class stack {
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int size(){
            return size;
        }

        int pop(){
            if(head == null) {
                System.out.println("stack is empty..");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head == null) {
                System.out.println("stack is empty..");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if(head == null) return true;
            return false;
        }

        void display(){
            displayrecursively(head);
        }

        void displayrecursively(Node h){
            if(h == null) return;
            displayrecursively(h.next);
            System.out.print(h.val + " ");
        }
    }
    public static void main(String[] args) {
        stack sh = new stack();
        sh.push(1);
        sh.push(2);
        sh.push(3);
        sh.push(4);
        sh.push(5);
        System.out.println(sh.peek());
        System.out.println(sh.pop());
        System.out.println(sh.size());
        sh.display();
        System.out.println();
        System.out.println(sh.pop());
    }
}
