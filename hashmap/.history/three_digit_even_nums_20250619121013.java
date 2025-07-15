import java.util.ArrayList;
import java.util.HashMap;

public class three_digit_even_nums {
    public static int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> set = new ArrayList<>();
        int[] ans = new int[set.size()];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < digits.length; i++){
            if(map.containsKey(digits[i])){
                int count = map.get(digits[i]);
                map.put(digits[i], count + 1);
            } else {
                map.put(digits[i], 1);
            }
        }

        for(int i = 100; i <= 999; i+=2){

            int x = i;
            int c = x % 10; x /= 10;
            int b = x % 10; x /= 10;
            int a = x;

            if(map.containsKey(a)){
                map.put(a, map.get(a) - 1);
                if(map.get(a) == 1) map.remove(a);

                if(map.containsKey(b)){
                    map.put(b, map.get(b) - 1);
                    if(map.get(b) == 1) map.remove(b);

                    if(map.containsKey(c)){
                        set.add(i);
                    }
                    map.put(b, map.get(b) + 1);
                }
                map.put(a, map.get(a) + 1);
            }
        }

        // System.out.println(set);

        for(int i = 0; i < set.size(); i++){
            ans[i] = set.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};

        int[] ans = findEvenNumbers(digits);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
