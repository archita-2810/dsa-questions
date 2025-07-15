import java.util.HashMap;

public class three_digit_even_nums {
    public static int[] findEvenNumbers(int[] digits) {
        int[] ans = new int[digits.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < digits.length; i++){
            if(map.containsKey(digits[i])){
                int count = map.get(digits[i]);
                
            } else {
                map.put(digits[i], 1);
            }
        }

        for(int i = 100; i <= 999; i++){

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
