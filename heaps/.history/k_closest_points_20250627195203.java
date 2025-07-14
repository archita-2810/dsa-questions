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
    public static int[][] kClosest(int[][] points, int k) {
        
    }
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;

        int[][] result = kClosest(points, k);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
        }
    }
}
