import java.util.Map;
import java.util.*;


class HMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<String, Integer>();

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        System.out.println(numbers);

        //if key: two is absent then 23 is added as value
        numbers.putIfAbsent("two", 23);

        //override
        numbers.put("two", 14);

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key : numbers.keySet()) {  //iterate through only key
            System.out.println(key);
        }
            
        //iterate through only values
        for (Integer value : numbers.values()) { // iterate through only key
            System.out.println(value);
        }

        System.out.println(numbers.containsValue(1));
        System.out.println(numbers.containsKey("two"));

        System.out.println(numbers.isEmpty());

    }
}
