import java.util.ArrayDeque;

//In ArrayDec elements can be added and removed from both sides
//It is efficient than LL because there is no null pointer
//ArrayDec can also implement stack

class arraydeccollec {
    public static void main(String[] args) {
        ArrayDeque<Integer> aq = new ArrayDeque<>();

        aq.offer(2);
        aq.offerFirst(1);
        aq.offerLast(3);
        System.out.println(aq);

        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());

        System.out.println(aq.poll()); //by default (LIFO)i.e; 1st element is removed
        System.out.println(aq.pollFirst());
        System.out.println(aq.pollFirst());


    }
}
