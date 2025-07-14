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

    public void upheaphify(int idx){
        int p = (idx - 1)/2;
        if(arr[idx] < arr[p]) swap(idx, p);
    }

    public void swap(int idx, int p){
        int temp = arr[idx];
        arr[idx] = arr[p]
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
