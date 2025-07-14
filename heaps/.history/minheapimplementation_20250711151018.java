class Minheap {
    private int[] arr;
    private int size;

    Minheap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int val) throws Exception {
        if(size == arr.length) throw new Exception("heap is full!");
        arr[size++] = val;
        upheaphify(size - 1);
    }

    public void upheaphify(int idx) {
        if (idx == 0)
            return;
        int p = (idx - 1) / 2;
        if (arr[idx] < arr[p]) {
            swap(idx, p);
            upheaphify(p);
        }
    }

    public void swap(int idx, int p) {
        int temp = arr[idx];
        arr[idx] = arr[p];
        arr[p] = temp;
    }

    public int size() {
        return size;
    }

    public int peek() throws Exception {
        if (size == 0)
            throw new Exception("heap is empty");
        return arr[0];
    }

    public int remove() throws Exception {
        if(size == 0) throw new Exception("heap is empty!");
        int peek = arr[0];

        swap(0, size-1);
        size--;
        downheapify(0);
        return peek;
    }

    public void downheapify(int i){
        int lc = 2*i + 1; int rc = 2*i + 2;
        
    }
}

public class minheapimplementation {
    public static void main(String[] args) throws Exception {
        Minheap pq = new Minheap(10);
        pq.add(1);
        System.out.println(pq.peek());
        pq.add(6);
        pq.add(0);
        System.out.println(pq.peek());
        pq.add(2);
    }
}
