class Minheap {
    int[] arr;
    int size;

    Minheap(int capacity){
        arr = new int[capacity];
        size = 0;
    }

    public void add(int val) {
        arr[size++] = val;
        upheaphify(size-1);
    }

    
}

public class minheapimplementation {
    public static void main(String[] args) {
        Minheap pq = new Minheap(10);
        pq.add(1);
        pq.add(6);
        pq.add(0);
        pq.add(2);
    }
}
