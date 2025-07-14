import java.util.PriorityQueue;

class tuple implements Comparable<tuple>{
    int val1;
    int val2;
    int val;

    public tuple(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
        this.val = (double) val1/val2;
    }

    public int compareTo(tuple t) {
        return this.val - t.val;
    }
}

public class kth_smallest_prime_fraction {
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] ans = new int[2];
        PriorityQueue<tuple> pq = new PriorityQueue<>();

        // int i = 0; int j = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pq.add(new tuple(arr[i], arr[j]));
            }
        }

        int n = k;
        while(n > 0){
            ans[0] = pq.poll().val1;
            ans[1] = pq.poll().val2;
            n--;
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
