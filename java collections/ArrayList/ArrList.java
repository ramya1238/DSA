//add
//remove
//sort
//size
//get-for-foreach-iterator class
//set/modify
//add in btwn
//contains


import java.util.*;

class ArrayList {
        public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();

        //add
        list.add(1);
        list.add(0);
        list.add(4);
        list.add(3);
        System.out.println(list);

        //get
        int res = list.get(1);
        System.out.println(res);

        //modify or change value at particualr index
        list.set(0, 5);
        System.out.println(list);

        //delete
        System.out.println(list.remove(0)); //to print only removed element
        

        //sort
        Collections.sort(list);
        System.out.println(list);

        //add in between
        list.add(2, 9);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //search
        System.out.println(list.contains(3));

        //for each
        for (Integer element : list) {
            System.out.println(element);
        }
        
        //iterator class
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {  //until each element in list has next elemt
            System.out.println("iterator" + it.next());
        }


    }
}