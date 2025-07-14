import java.util.Collections;
import java.util.PriorityQueue;

class Track {
    int num;
    int idx;

    public Track(){

    }
}
public class relative_ranks {
    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < score.length; i++){
            pq.add(score[i]);
        }

        while(pq.size() > 0){

        }
        return result;
    }
    public static void main(String[] args) {
        int[] scores = {5,4,3,2,1};

        String[] res = findRelativeRanks(scores);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}