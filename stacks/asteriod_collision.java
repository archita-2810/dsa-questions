import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class asteriod_collision {
    public static int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> sh = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int val = asteroids[i];

            if(val > 0) sh.push(val);
            else {
                while (!sh.isEmpty() && sh.peek() > 0 && sh.peek() < Math.abs(val)) {
                    sh.pop();
                }

                if(!sh.isEmpty() && sh.peek() == Math.abs(val)) sh.pop();
                else if(sh.isEmpty() || sh.peek() < 0){
                    sh.push(val);
                }
            }
        }

        int ans[] = new int[sh.size()];

        while(!sh.isEmpty()){
            arr.add(sh.pop());
        }
        
        Collections.reverse(arr);
        for (int i = 0; i < arr.size(); i++)
            ans[i] = arr.get(i);

        return ans;
    }
    public static void main(String[] args) {
        int asteriods[] = {-2, -2, 1, -2};
        int result[] = asteroidCollision(asteriods);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
