//addFirst, addLast = add
//remooveFirst, removeLast, remove(index)
//size()
//displaying with for loop, get(index)
//modifying add(index, element)
//search with- for-loop

import java.util.LinkedList;

class LLcollec {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //addFirst
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);

        //addLast
        list.add("list");

        //display list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");

        //size of list
        System.out.println(list.size());

        //removeFirst
        list.removeFirst();
        System.out.print(list);

        //removeLast
        list.removeLast();
        System.out.println(list);

        //remove particular element
        list.remove(0);
        System.out.println(list);

        //get particular element
        System.out.println(list.get(0));

        //search a element
        String value = "a";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(0) == value) {
                System.out.println(i);
            }
        }

        //add in between
        list.add(1,"ramya");
        System.out.println(list);
    }
}
