import java.util.*;

public class reversing_stack {
    public static void main(String[] args) {
        Stack<Integer> sto = new Stack<>();
        sto.push(1);
        sto.push(2);
        sto.push(3);
        sto.push(4);

        Stack<Integer> str = new Stack<>();
        while(!sto.isEmpty()){
            int element = sto.pop();
            str.push(element);
        }

        System.out.println(str);
    }
}
