import java.util.*;

class priorqueuecollec {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
                                                        //    ^
                                                         //   if u want to get greater element as priority 

        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        System.out.println(pq);

        //priorityQueue arranges the most smallest element first
        //remaining elements arrangements also done internally


        System.out.println(pq.poll());
        System.out.println(pq);


        System.out.println(pq.peek());
    }
}
