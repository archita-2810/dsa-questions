
public class array_implementation_of_stack {
    public static class stack {
        private int arr[] = new int[5];
        private int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("stack is full, we cannot add this value");
            }

            arr[idx] = x;
            idx++;
        }

        int peek(){
            if(idx == 0){
                System.out.println("stack is empty..");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(isEmpty()){
                System.out.println("the stack is empty we cannot pop anything");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void display(){
            for(int i = 0; i < idx; i++){
                System.out.print(arr[i] + " ");
            }
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            return false;
        }

        boolean isFull(){
            if(idx == arr.length) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        stack sh = new stack();
        sh.push(1);
        sh.push(2);
        sh.push(3);
        sh.push(4);
        sh.push(5);
        System.out.println(sh.peek());
        System.out.println(sh.pop());
        System.out.println(sh.size());
        sh.display();
        System.out.println();
        System.out.println(sh.pop());
    }
}