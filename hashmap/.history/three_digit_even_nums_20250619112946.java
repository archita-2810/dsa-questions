public class three_digit_even_nums {
    public static int[] findEvenNumbers(int[] digits) {
        int[] ans = new int[digits.length];
        HashMap<Integer, Integer>
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
