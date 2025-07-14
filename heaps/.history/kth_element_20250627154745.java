
import java.util.PriorityQueue;

public class kth_element {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }

        for(int i = 1; i < k; i++){
            pq.remove();
        }

        return pq.peek();
    }
    public static int kthLargest(int[] arr, int k){}
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println(kthSmallest(arr, k));
        // 2nd method
        // Arrays.sort(arr);
        // System.out.println(arr[k-1]);

        // 3rd method
        // PriorityQueue<Integer> yaar = new PriorityQueue<>(Collections.reverseOrder());
        // for(int i = 0; i < arr.length; i++){
        //     yaar.add(arr[i]);
        // }

        // System.out.println(yaar.toArray()[arr.length-k+1]);
    }
}
