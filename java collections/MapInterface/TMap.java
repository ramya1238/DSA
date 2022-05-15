//TreeMap sort based on key
//contains same functions of HashMap7

import java.util.*;
class TMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        System.out.println(numbers);

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
        }

        numbers.remove("three");
        System.out.println(numbers);

    }   
}
