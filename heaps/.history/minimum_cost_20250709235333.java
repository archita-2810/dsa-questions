import java.util.PriorityQueue;

public class minimum_cost {
    public static int minCost(int[] arr){
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
        }

        int sum = 0;
        while(pq.size() > 1){
            int y = pq.poll();
            int x = pq.poll();
            sum += y + x;
            pq.add(sum);
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        System.out.println(minCost(arr));
    }
}
