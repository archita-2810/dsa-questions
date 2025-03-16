public class next_greater_element {
    //brute force
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int result[] = new int[m];
        for(int i = 0; i < m; i++){
            result[i] = -1;
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n-1; j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j; k < n; k++){
                        if(nums2[j] < nums2[k]) {
                            result[i] = nums2[k];
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }
    //using stacks
    public static int[] nextGreaterElementI(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int result[] = new int[m];
        for(int i = 0; i < m; i++){
            result[i] = -1;
        }

        

        return result;
    }
    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        int result[] = nextGreaterElement(nums1, nums2);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        int resultI[] = nextGreaterElementI(nums1, nums2);
        for(int i = 0; i < resultI.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
