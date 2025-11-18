
public class StringBuilders {

	public static void main(String[] args) {
         
		StringBuilder s=new StringBuilder("The quick brown fox ");
		s.append( "jumps over the lazy dog.");
		s.insert(4, "really ");
		int start = s.indexOf("brown");
        int end = start + "brown".length() + 1;
        s.delete(start, end);
		System.out.println(s);
		
		
	}

}
