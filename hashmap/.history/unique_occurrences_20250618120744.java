import java.util.TreeMap;

public class unique_occurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])) {
                int count = map.get(arr[i])
            }
            map.put(arr[i], )
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,1,3};

        System.out.println(uniqueOccurrences(arr));
    }
}
