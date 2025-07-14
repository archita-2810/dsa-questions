import java.util.PriorityQueue;

class Pair1 implements Comparable<Pair1> {
    int num;
    int idx;

    public Pair1(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }

    public int compareTo(Pair1 p){
        return this.num - p.num;
    }
}

public class minimize_deviation {
    public static int minimumDeviation(int[] nums) {
        int n = nums.length;
        PriorityQueue<Pair1> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(new Pair1(nums[i], i));
        }

        Pair1 p1 = pq.poll();
        nums[p1.idx] = (p1.num % 2 != 0) ? p1.num * 2 : p1.num;
        System.out.println(nums[p1.idx]);

        while(pq.size() > 1){
            // System.out.println(pq.peek().num);
            pq.poll();
        }

        Pair1 p = pq.poll();
        nums[p.idx] = (p.num % 2 == 0) ? p.num / 2 : p.num;
        // System.out.println(nums[p.idx]);

        int diff = Integer.M;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                diff = Math.min(diff, Math.abs(nums[i] - nums[j]));
            }
        }

        return diff;
    }
    public static void main(String[] args) {
        int[] arr = {2, 10, 8};

        System.out.println(minimumDeviation(arr));
    }
}