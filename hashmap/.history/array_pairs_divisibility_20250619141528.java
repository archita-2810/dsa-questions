public class array_pairs_divisibility {
    public static boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int count = 0;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum % k == 0) {
                count++;
                i++;
            }
            j--;
        }
        return count == n/2;
    }
    public static void main(String[] args) {
        int[] arr = {-1,1,-2,2,-3,3,-4,4};
        int k = 3;

        System.out.println(canArrange(arr, k));
    }
}
