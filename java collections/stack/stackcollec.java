import java.util.*;

class stackcollec {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        //push
        st.push(1);
        st.push(3);
        st.push(7);
        System.out.println(st);

        //peek
        System.out.println(st.peek());

        //pop
        System.out.println(st.pop());

    }
}
