
public class StringBuffers {

	public static void main(String[] args) {

		StringBuffer s=new StringBuffer("Mutable Strings Are Great!");
		s.reverse();
		int start = s.indexOf("sgnirtS");
        int end = start + "sgnirtS".length() ;
        s.replace(start, end, "Objects");
        System.out.println(s);
		
		
		
		
		
	}

}
