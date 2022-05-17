public class stackLL {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //push - insert-begin in LL
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = null;
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    //pop
    public void pop() {
        if (head == null) {
            System.out.println("stack is empty in pop operation");
            return;
        }
            head = head.next;
    }

    //peek - displaying the starting node
    public void peek() {
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
            System.out.println(head.data);
    }

    
    public static void main(String[] args) {
        stackLL st = new stackLL();
        st.push(1);
        st.push(2);
        st.peek();
        st.pop();
        st.peek();
    }
}
