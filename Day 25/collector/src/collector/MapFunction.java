package collector;

import java.util.*;

public class MapFunction{

	public static void main(String[] args) {
		List<String> list =Arrays.asList("act","apple","axe","bat","ball","nithin","nithin","nithin","nithin","nithin","nithin","nithin","nithin");
		Map<String,Integer> map = new HashMap<>();
		for (String element : list) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
		ArrayList<Map.Entry<String,Integer>> sorts=new ArrayList<>(map.entrySet());
		sorts.sort((entry1,entry2)->entry1.getValue().compareTo(entry2.getValue()));
		 for (Map.Entry<String, Integer> entry : sorts) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
		
		
	   
	}



}
