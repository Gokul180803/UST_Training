import java.util.*;
import java.util.stream.*;

public class CollectorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "aB");
        Map<Character, String> map = list.stream()
                .collect(Collectors.toMap(
                    s -> s.charAt(0), 
                    s -> s,(s1, s2) -> s1 + ", " + s2));
        System.out.println(map);  // Output: {1=A, 2=B, 1=C}
    }
}
