import java.util.Stack;

public class valid_stack_sequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        // boolean check = false;
        int m = 0;
        int n = pushed.length;
        Stack<Integer> sh = new Stack<>();
        for(int i = 0; i < n; i++){
            sh.push(pushed[i]);
            if(!sh.isEmpty() && sh.peek() == popped[m]){
                sh.pop();
                m++;
            }
        }

        return sh.isEmpty();
    }
    public static void main(String[] args) {
        int pushed[] = {1,2,3,4,5};
        int popped[] = {4,3,5,1,2};

        System.out.println(validateStackSequences(pushed, popped));
    }
}
