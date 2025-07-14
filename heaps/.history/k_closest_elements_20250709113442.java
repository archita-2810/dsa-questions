import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class k_closest_elements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> dist = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++)

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        List<Integer> ans = findClosestElements(arr, 4, 3);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
