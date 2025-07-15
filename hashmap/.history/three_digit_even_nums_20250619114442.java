import java.util.HashMap;
import java.util.HashSet;

public class three_digit_even_nums {
    public static int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
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
        System.out.println("this is hashmap - ", map.get());

        for(int i = 100; i <= 999; i++){
            String s = Integer.toString(i);
            boolean check = false;

            for(int j = 0; j < s.length(); j++){
                int num = s.charAt(i) - '0';
                if(!map.containsKey(num)) {
                    check = false;
                    break;
                }
                else check = true;
            }

            if(check && Integer.parseInt(s) % 2 == 0){
                set.add(Integer.parseInt(s));
            }
        }

        int i = 0;
        for (int val : set) {
            ans[i++] = val;
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
