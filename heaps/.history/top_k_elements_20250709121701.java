import java.util.ArrayList;
import java.util.List;

class Pair implements Comparable<Pair> {
    int num;
    int freq;

    public Pair(int num, int freq){
        this.num = num;
        this.freq = freq;
    }

    
}
public class top_k_elements {
    public static ArrayList<Integer> topKFrequent(int[] arr, int k){

    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        List<Integer> ans = topKFrequent(arr, 2);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
