import java.util.PriorityQueue;

class PointWithValue {
    int x;
    int y;
    double value;

    PointWithValue(int x, int y, double value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }
}

public class k_closest_points {
    public static int distancefromorigin(int x, int y){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<PointWithValue> pq = new PriorityQueue<>((a, b) -> Double.compare(a.value, b.value));
        int[][] ans = new int[k][k];



        return ans;
    }

    public static void main(String[] args) {
        int[][] points = { { 1, 3 }, { -2, 2 } };
        int k = 1;

        int[][] result = kClosest(points, k);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
