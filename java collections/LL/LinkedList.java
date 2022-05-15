//insert-first,last
//delete-fast,last
//display
//size of LL
//revere-iteration
//delete nth node from last
//palindrome just concepts-no pgm-must know atleast concept
//detect and detect cycle-concepts
//merge two sorted LL-concepts

class LinkedList {
    Node head;
    private int size; //size of list
    int n;

    LinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add-First, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    
    //add
    public void addLast(String data) {
        Node newNode = new Node(data);
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
    }

    //display
    public void display() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print(currNode.data + " -> ");
        System.out.println("null");

    }

    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete-last
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        size--;
        if (head.next == null) { //if there is single node then make head as null
            head = null;
            return;
        }

        Node currNode = head;
        Node prevNode = currNode;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;

    }
    
    public int getSize() {
        return size;
    }

    //Reversing LL-iterator method
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;  //changing the direction of arraow 1<-2

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head = prevNode;
    }

    //delete nth node from last
    
    public void dfs(int n) {
        if (head.next == null) {
            return;
        }

        if (n == size) {
            head = head.next;
        }

        //checking size of LL
        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }

        int prevNodeIndex = size - n; //previous node index from first
        Node prevNode = head;
        while (prevNodeIndex > 1) {
            prevNode = prevNode.next;
            prevNodeIndex--;
        }
        prevNode.next = prevNode.next.next;

    }
    
    //detect cycle in LL
    public void detcycle() {
        Node slw = head;
        Node fst = head;

        while (slw.next.next != null && fst.next != null) {
            slw = slw.next;
            fst = fst.next.next;

            if (slw == fst) {
               // slw.next = null; //to remove cycle
                System.out.println("yes");
            }
        }
        System.out.println("no");
    }
    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        //list.deleteLast();
        list.display();
        //list.reverseIterate();
        list.dfs(2);
        list.detcycle();
        list.display();
        //System.out.println(list.getSize());

    }
}