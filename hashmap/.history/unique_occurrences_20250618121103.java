import java.util.HashSet;
import java.util.TreeMap;

public class unique_occurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> occurrences = new HashSet<>();
        for (int freq : map.values()) {
            if (!occurrences.add(freq)) {
                return false; // duplicate frequency found
            }
        }

        return true;


    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,1,3};

        System.out.println(uniqueOccurrences(arr));
    }
}
