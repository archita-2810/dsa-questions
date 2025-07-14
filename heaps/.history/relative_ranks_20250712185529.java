import java.util.Collections;
import java.util.PriorityQueue;

class Track implements Comparable<Track>{
    int num;
    int idx;

    public Track(int num, int idx){
        this.num = num;
        this.idx = idx;
    }

    public int compareTo(Track t){
        return t.num - this.num;
    }
}

public class relative_ranks {
    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        PriorityQueue<Track> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < score.length; i++){
            pq.add(new Track(score[i], i));
        }

        Track t = pq.poll();
        result[t.idx] = "Gold Medal";

        Track t1 = pq.poll();
        result[t1.idx] = "Silver Medal";

        Track t2 = pq.poll();
        result[t2.idx] = "Bronze Medal";

        while(pq.size() > 0){
            Track t3 = pq.poll();
            result[t3.idx] = t3.
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