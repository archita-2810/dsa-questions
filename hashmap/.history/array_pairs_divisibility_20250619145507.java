import java.util.HashMap;

public class array_pairs_divisibility {
    public static boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], i);
            if(map.containsKey(k + (arr[i] % k))){
                count++;
            }
        }

        return count == (n/2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
        int k = 10;

        System.out.println(canArrange(arr, k));
    }
}
