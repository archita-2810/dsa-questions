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

public class prices_with_a_special_discount {
    public static int[] finalPrices(int[] prices) {
        int n = prices.length;
        int ans[] = new int[n];
        Stack<Pair<Integer, Integer>> sh = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!sh.isEmpty() && prices[i] <= sh.peek().getSecond()){
                ans[sh.peek().getFirst()] = sh.peek().getSecond() - prices[i];
                sh.pop();
            }
            sh.push(new Pair<>(i, prices[i]));
        }

        while(!sh.isEmpty()){
            ans[sh.peek().getFirst()] = sh.peek().getSecond();
            sh.pop();
        }

        return ans;
    }
    public static void main(String[] args) {
        int prices[] = {8,4,6,2,3};
        int result[] = finalPrices(prices);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
