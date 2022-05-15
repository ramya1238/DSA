import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Arrayscollecclass {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = Arrays.binarySearch(numbers, 4); //works only in sorted array
        
        System.out.println(index);

        Arrays.sort(numbers);

        Arrays.fill(numbers, 12);

        //collections-class
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(5);
        list.add(3);

        System.out.println(Collections.min(list));
        System.out.println(Collections.frequency(list, 1));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}
