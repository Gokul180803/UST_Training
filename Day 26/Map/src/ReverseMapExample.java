import java.util.*;

public class ReverseMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 5);
        map.put("Apple", 2);
        map.put("Cherry", 10);

        // Sorting by keys in descending order (reverse)
        Map<String, Integer> reversedMap = new TreeMap<>(Collections.reverseOrder());
        reversedMap.putAll(map);

        System.out.println("Original Map: " + map);
        System.out.println("Reversed Map by Keys (Descending): " + reversedMap);
    }
}
