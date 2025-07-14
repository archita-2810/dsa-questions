import java.util.PriorityQueue;

class Pair3 {
    int num;
    int row;

    public Pair3(int num, int row){
        
    }
}
public class kweakest_row {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1) count++;
            }
            pq.add(count);
        }

        int f = 0;
        while (k > 0) {
            ans[f] = pq.poll();
            f++;
            k--;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };

        int[] arr = kWeakestRows(mat, 3);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
