import java.util.HashMap;

public class array_pairs_divisibility {
    public static boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.isEmpty() && map.containsKey(k-arr[i])){
                count++;
            }
            map.put(arr[i], i);
        }

        return count == n/2;
    }
    public static void main(String[] args) {
        int[] arr = {-1,1,-2,2,-3,3,-4,4};
        int k = 3;

        System.out.println(canArrange(arr, k));
    }
}
