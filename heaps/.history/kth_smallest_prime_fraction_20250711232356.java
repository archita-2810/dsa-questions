import java.util.PriorityQueue;

class tuple {
    int val1;
    int val2;
    double val;

    public tuple(int val1, int val2, double val){
        this.val1 = val1;
        this.val2 = val2;
        this.val = val;
    }

    public double compareTo(tuple t) {
        return this.val - t.val;
    }
}

public class kth_smallest_prime_fraction {
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] ans = new int[2];
        PriorityQueue<tuple> pq = new PriorityQueue<>();

        // int i = 0; int j = 0;

        for(int i = 0; i < arr.length; i++){
            int j = 0;
            if(i < j){
                pq.add(arr[i], arr[j], arr[i])
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        int[] res = kthSmallestPrimeFraction(arr, 3);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
