public class array_pairs_divisibility {
    public static boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        
        int i = 0;
        int j = n-1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum % k == 0) return true;
            else {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,1,2,3,4};
        int k = 10;

        System.out.println(canArrange(arr, k));
    }
}
