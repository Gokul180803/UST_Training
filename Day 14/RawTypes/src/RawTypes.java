class RawBox{
	private Object item;

    RawBox(Object item) {
		this.item = item;
	}

	public Object getItem() {
		return item;
	}
	
	
}



public class RawTypes {

	public static void main(String[] args) {
		
		RawBox intBox = new RawBox(123);
        Integer intValue = (Integer) intBox.getItem(); // Correct cast
        System.out.println("Integer value: " + intValue);

        // RawBox holding a String
        RawBox strBox = new RawBox("Hello World");
        //  Incorrect cast: trying to cast String to Integer
        Integer wrongCast = (Integer) strBox.getItem(); 
        System.out.println("This will not print: " + wrongCast);

	}

}
