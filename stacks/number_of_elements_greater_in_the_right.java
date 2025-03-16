
public class number_of_elements_greater_in_the_right {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]){
        int n = indices.length;
        int answer[] = new int[n];

        //brute force
        for(int i = 0; i < n; i++){
            int count = 0;
            int index = indices[i];
            for(int j = index+1; j < arr.length; j++){
                if(arr[index] < arr[j]) count++;
            }
            answer[i] = count;
        }

        return answer;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 7, 5, 8, 10, 6};
        int queries = 2;
        int indices[] = {0, 5};
        int answer[] = count_NGEs(arr.length, arr, queries, indices);
        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}
