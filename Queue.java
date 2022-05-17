//queue using array
//using LL can do
//problm - queue with 2 stacks(converting FIFO to LIFO) 

public class Queue {
    int f = -1, r = -1, data;
    int arr[] = new int[5];
    
    //enqueue
    public void enqueue(int data) {
        if (f == -1 && r == -1) {
            f = 0;
            r = 0;
        }
        if (r == arr.length - 1) {
            System.out.println("queue is full");
            return;
        }
        r++;
        arr[r] = data;

    }

    //dequeue
    public void dequeue() {
        if (f == -1) {
            System.out.println("queue is empty");
            return;
        }
        data = arr[f];
        f++;

    }

    //peek
    public void peek() {
        if (f == -1) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println(arr[f]);
    }


    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.peek();
    }
}
