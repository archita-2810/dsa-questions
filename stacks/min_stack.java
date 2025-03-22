import java.util.Stack;

public class min_stack {
    class MinStack {
        Stack<Pair<Integer, Integer>> sh = new Stack<>();
        public MinStack(){

        }

        public void push(int val){
            if(sh.isEmpty()) {
                sh.push(new Pair<>(val, val));
            } else {
                int minval = Math.min(val, sh.peek().getSecond());
                sh.push(new Pair<>(val, minval));
            }
        }

        public void pop(){
            if(!sh.isEmpty()) sh.pop();
        }

        public int top() {
            return sh.peek().getFirst();
        }
        
        public int getMin() {
            return sh.peek().getSecond();
        }
    }
    public static void main(String[] args) {
        
    }
}
