import java.util.Stack;

public class largest_rectangle_of_the_histogram {
    public static int largestRectangleArea(int[] heights) {
        int count = 0;
        int n = heights.length;
        Stack<Integer> sh = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!sh.isEmpty() && heights[sh.peek()] > heights[i]){
                int element = sh.peek();
                sh.pop();
                int nse = i;
                int pse = sh.isEmpty() ? -1 : sh.peek();
                count = Math.max(heights[element] * (nse - pse - 1), count);
            }
            sh.push(i);
        }

        while(!sh.isEmpty()){
            int nse = n;
            int element = sh.peek();
            sh.pop();
            int pse = sh.isEmpty() ? -1 : sh.peek();
            count = Math.max(heights[element] * (nse - pse - 1), count);
        }

        return count;
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
