import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

public class top_k_elements {
    public static ArrayList<Integer> topKFrequent(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        while (k-- > 0 && !pq.isEmpty()) {
            res.add(pq.poll().num);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 4, 5, 2, 6, 1 };
        List<Integer> ans = topKFrequent(arr, 2);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
