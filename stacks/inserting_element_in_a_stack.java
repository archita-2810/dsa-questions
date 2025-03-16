import java.util.Stack;

public class inserting_element_in_a_stack {
    //function for inserting element at any index
    public static void inserting_element_at_any_index(Stack<Integer> stack, int element, int index){
        Stack<Integer> tempstack = new Stack<>();
        while(stack.size() >= index){
            tempstack.push(stack.pop());
        }
        stack.push(element);
        while(!tempstack.isEmpty()){
            stack.push(tempstack.pop());
        }
    }
    //function for inserting element at the bottom
    public static void inserting_element_at_the_bottom(Stack<Integer> stack, int element){
        Stack<Integer> tempstack = new Stack<>();
        while(!stack.isEmpty()){
            tempstack.push(stack.pop());
        }

        stack.push(element);
        while(!tempstack.isEmpty()){
            stack.push(tempstack.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        inserting_element_at_any_index(stack, 6, 2);
        System.out.println(stack);

        inserting_element_at_the_bottom(stack, 5);
        System.out.println(stack);
    }
}
