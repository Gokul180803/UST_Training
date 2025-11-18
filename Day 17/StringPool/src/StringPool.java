public class StringPool {
    public static void main(String[] args) {
    	
    	
    	 String s1 = "Hello";
    	 String s2 = "Hello";
    	 String s3 = new String("Hello");
    	 String s4 = new String("Hello");
    	 String s5 = "World";
    	 String s6 = "He" + "llo";
    	 String s7 = "Hello".intern();
    	 String s8 = new String("Hello").intern();
    	 
    	 
    	System.out.println( s1 == s2);
    	System.out.println(s1.equals(s2));
    	System.out.println(s1 == s3);
    	System.out.println(s1.equals(s3));
    	System.out.println(s3 == s4);
    	System.out.println(s3.equals(s4));
    	System.out.println(s1 == s6);
    	System.out.println(s1 == s7);
    	System.out.println(s3 == s7);
    	System.out.println( s1 == s8);
    	System.out.println(s7 == s8);
    		
    	 
       
    }
}
