
public class StringUtils {
     public static String reverseString(String input) {
    	 if(input==null) {
    		 return null;
    	 }
		return new StringBuilder(input).reverse().toString();
    	 
     }
     public static boolean isPalindrome(String input) {
    	 if(input==null) {
    		 return false;
    	 }
         String normalized = input.replaceAll("\\s+", "").toLowerCase();
           String rev=new StringBuilder(normalized).reverse().toString();
           return normalized.equals(rev);
          
     }
	
}
