import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class triplet implements Comparable<triplet>{
    int rowno;
    int num;
    int colno;

    public triplet(int rowno, int num, int colno)
}
public class smallest_range {
    public static int[] smallestRange(List<List<Integer>> nums) {
        int[] res = new int[2];
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        int max = 0;
        

        return res;
    }
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(new ArrayList<>(Arrays.asList(4, 10, 15, 24, 26)));
        nums.add(new ArrayList<>(Arrays.asList(0, 7, 12, 21)));
        nums.add(new ArrayList<>(Arrays.asList(5, 18, 22, 30)));

        int[] arr = smallestRange(nums);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
