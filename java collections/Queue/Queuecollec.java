import java.util.*;

class Queuecollec {
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue.peek());
    }
}
