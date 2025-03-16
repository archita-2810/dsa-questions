import java.util.Stack;

public class reverse_stack_recursively {
    public static void display_stack(Stack<Integer> stack){
        if (stack.isEmpty()) return;
        int top = stack.pop();
        System.out.println(top);
        display_stack(stack);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        display_stack(stack);
        System.out.println(stack);
    }
}
