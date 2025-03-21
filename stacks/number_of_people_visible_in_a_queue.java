import java.util.Stack;

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

public class number_of_people_visible_in_a_queue {
    public static int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int ans[] = new int[n];
        Stack<Pair<Integer, Integer>> sh = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            int count = 0;
            while(!sh.isEmpty() && sh.peek().getSecond() < heights[i]){
                // ans[sh.peek().getFirst()] = i - sh.peek().getFirst();
                sh.pop();
                count++;
            }

            if(!sh.isEmpty()){
                count++;
            }

            ans[i] = count;
            sh.push(new Pair<>(i, heights[i]));
        }

        // while(!sh.isEmpty()){
        //     ans[sh.peek().getFirst()] = n-sh.peek().getFirst()-1;
        //     sh.pop();
        // }

        return ans;
    }
    public static void main(String[] args) {
        int heights[] = {10,6,8,5,11,9};
        int result[] = canSeePersonsCount(heights);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
