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

public class stock_span_problem {
    public static int maxProfitI(int[] prices) { //stack use
        int n = prices.length;
        int result[] = new int[n];
        int count = 0;
        Stack<Pair<Integer, Integer>> sh = new Stack<>();
        for(int i = 0; i < n; i++){
            while (!sh.isEmpty() && prices[i] >= sh.peek().getFirst()) {
                sh.pop();
            }

            result[i] = sh.isEmpty() ? i + 1 : i - sh.peek().getSecond();
            count = Math.max(result[i], count);
            sh.push(new Pair<>(prices[i], i));
        }

        // for (int r : result) {
        //     count = Math.max(count, r);
        // }

        return count;
    }
    public static int maxProfit(int[] prices) { //brute force
        int n = prices.length;
        int result[] = new int[n];
        result[0] = 1;
        int count = 1;
        for(int i = 1; i < n; i++){
            int element = prices[i];
            count = 1;
            for(int j = i-1; j >= 0 && (element >= prices[j]); j--){
                count++;
            }
            result[i] = count;
        }

        for(int i = 0; i <n; i++){
            System.out.print(result[i] + " ");
        }

        return count;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        // System.out.println(maxProfit(prices));
        maxProfit(prices);
        System.out.println(maxProfitI(prices));
    }
}