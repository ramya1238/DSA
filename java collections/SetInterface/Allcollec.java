//HashSet
//TreeSet
//LinkedHashSet

import java.util.*;

class Allcollec {
    public static void main(String[] args) {

        //HashSet- elements are unique and not in order we add
        Set<Integer> set = new HashSet<>();

        //LinkedHashSet- elememts are connected so printed in order they are added
        Set<Integer> linkedSet = new LinkedHashSet<>();
        
        //TreeSet- elements are sorted
        Set<Integer> ts = new TreeSet<>();

        set.add(32);
        set.add(1);
        set.add(45);
        set.add(60);
        set.add(60);

        System.out.println(set);
        System.out.println(linkedSet);
        System.out.println(ts);

        set.remove(1); //here element as given as parameter not index 
        System.out.println(set);

        System.out.println(set.contains(1));

        System.out.println(set.isEmpty());

        set.clear();

        System.out.println(set.size());
    }
    
}
