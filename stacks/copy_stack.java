import java.util.*;

public class copy_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        Stack<Integer> copystack = new Stack<>();
        while(!stack.isEmpty()){
            int element = stack.pop();
            copystack.push(element);
        }
        System.out.println(copystack);

        Stack<Integer> finalstack = new Stack<>();
        while(!copystack.isEmpty()){
            int element = copystack.pop();
            finalstack.push(element);
        }
        System.out.println(finalstack);
    }
}
