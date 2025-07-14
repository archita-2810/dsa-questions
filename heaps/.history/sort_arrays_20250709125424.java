import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int num;
    int freq;

    public Pair(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }

    public int compareTo(Pair p) {
        if (this.freq != p.freq) {
            return p.freq - this.freq;
        } else {
            return p.num - this.num;
        }
    }
}

public class sort_arrays {
    public static int[] frequencySort(int[] nums) {
        int[] arr = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        for(int j = 0; j < arr.length; j++){
            arr[j] = pq
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};

        int[] result = frequencySort(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
