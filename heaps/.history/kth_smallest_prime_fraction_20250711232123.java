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

    public 
}
public class kth_smallest_prime_fraction {
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] ans = new int[2];
        PriorityQueue<tuple> pq = new PriorityQueue<>();

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
