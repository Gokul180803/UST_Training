import java.util.ArrayList;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> shopping_list =new ArrayList<>();
      shopping_list.add("Milk");
      shopping_list.add("Bread");
      shopping_list.add("Eggs");
      shopping_list.add("Apples");
       System.out.println("Initial Shopping List : "+shopping_list);
       shopping_list.remove("Bread");
       shopping_list.add("Cheese");
       if(shopping_list.contains("Milk")) {
    	  System.out.println("Milk is on the list.") ;
       }else {
     	  System.out.println("Milk is not on the list.") ;

       }
       System.out.println(shopping_list.indexOf("Eggs"));
    shopping_list.set(shopping_list.indexOf("Eggs"), "Organic Eggs");
    System.out.println("Final Shopping List : "+shopping_list);

    System.out.println(shopping_list.size());

	}
}


