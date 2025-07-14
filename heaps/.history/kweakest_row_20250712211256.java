public class kweakest_row {
    public static int[] kWeakestRows(int[][] mat, int k) {
        
    }
    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
        
        int[] arr = kWeakestRows(mat, 3);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
