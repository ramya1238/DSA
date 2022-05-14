//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. 
//Delete all nodes which have values greater than 25.


import java.util.LinkedList;
import java.util.*;

class LLprac {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        Scanner sc = new Scanner(System.in);
        int n = 6;
        System.out.println("give the numbers");
        for (int i = 0; i < n; i++) {
            int no = sc.nextInt();
            if (no <= 25) {
                list.add(no);
            }
            

        }
        
        sc.close();

        System.out.println(list);


    }
}
