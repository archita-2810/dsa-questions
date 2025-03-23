import java.util.Stack;

public class ll_palindrome {
    public static boolean isPalindrome(Node head) {
        Stack<Integer> sh = new Stack<>();
        Node temp = head;
        Node reverse = head;
        while(reverse != null){
            sh.push(reverse.val);
            reverse = reverse.next;
        }

        while(temp != null){
            if(temp.val == sh.peek()) sh.pop();
            temp = temp.next;
        }
        
        return sh.isEmpty();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(1);

        a.next = b; b.next = c;
        c.next = d;

        System.out.println(isPalindrome(a));
    }
}
