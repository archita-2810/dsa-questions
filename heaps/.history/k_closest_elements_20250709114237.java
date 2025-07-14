import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Couple implements Comparable<Couple> {
    int dist;
    int point;

    public Couple(int dist, int point){
        this.dist = dist;
        this.point = point;
    }

    public int compareTo(Couple c){
        return this.dist - c.dist;
    }
}

public class k_closest_elements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Couple> pq = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++){
            int val = Math.abs(x-arr[i]);
            pq.add(new Couple(val, arr[i]));
        }

        int y = k;
        while(y > 0){
            result.add(pq.poll().point);
            y--;
        }

        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,3,3,4,7,7,8};

        List<Integer> ans = findClosestElements(arr, 3, 5);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
