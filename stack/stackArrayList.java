import java.util.*;

public class stackArrayList {
    // ArrayList<Integer> st = new ArrayList<>();

    //     //push
    //     public void push(int data) {
    //         st.add(data);
    //     }

    //     //peek
    //     public void peek() {
    //         if (st.isEmpty()) {
    //             return;
    //         }
    //         int n = st.size();
    //         System.out.println(st.get(n - 1));
    //     }

    //     //pop
    //     public void pop() {
    //         if (st.isEmpty()) {
    //             return;
    //         }
    //         int n = st.size();
    //         st.remove(n-1);
    //     }

    // public static void main(String[] args) {
    //     stackArrayList stc = new stackArrayList(); //stc - stack function call

    //     stc.push(2);
    //     stc.push(34);
    //     stc.peek();
    //     stc.pop();
    //     stc.peek();

    // }



    //using stack collections
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(23);
        // st.push(45);
        // st.push(69);
        System.out.println(st);

        System.out.println(st.pop());


        if (!st.isEmpty()) {
            System.out.println(st.peek());
        }
    }
}
