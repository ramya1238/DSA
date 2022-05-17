//push ele at bottom of the stack - recursion
//Reverse stack - simple code without recursion

import java.util.*;

public class stackpblm {
    int x;
    public void PushAtBottom(int x, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(4);
            return;
        }

        int top = s.pop();
        PushAtBottom(4, s);
        s.push(top);
    }

    
    
    public static void main(String[] args) {
        stackpblm st = new stackpblm();
        Stack<Integer> s = new Stack<Integer>();

        s.push(1);
        s.push(2);
        s.push(3);

        st.PushAtBottom(4, s);
        
        System.out.println(s);
        
    }
}