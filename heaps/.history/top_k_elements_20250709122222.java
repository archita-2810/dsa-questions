import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int num;
    int freq;

    public Pair(int num, int freq){
        this.num = num;
        this.freq = freq;
    }

    public int compareTo(Pair p){
        return this.freq - p.freq;
    }
}
public class top_k_elements {
    public static ArrayList<Integer> topKFrequent(int[] arr, int k){
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int i = 0; i < arr.length; i++){
            pq.add(new Pair(arr[i], map.get(arr[i])));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        List<Integer> ans = topKFrequent(arr, 2);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
