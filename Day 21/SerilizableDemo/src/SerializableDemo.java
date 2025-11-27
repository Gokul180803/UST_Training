import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private double price;
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Book[Title: "+ title+", Author: "+author+", Price: "+price+"]";
	}
	
	
}
public class SerializableDemo {

	public static void main(String[] args) throws FileNotFoundException {
		

		Book books=new Book("Effective Java","Joshua Bloch",45.99);
		 try (FileOutputStream fos = new FileOutputStream("book.ser");
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

	           oos.writeObject(books);
	          System.out.println("Book object serialized to book.ser");
	        } catch (IOException e) {
	            System.out.println("Serialization error: " + e.getMessage());
	        }
		 Book obj=null;
		 try(FileInputStream F=new FileInputStream("book.ser");
				 ObjectInputStream O=new ObjectInputStream(F)){
			obj=(Book) O.readObject();
			
			
		 }catch (IOException | ClassNotFoundException e) {
	           System.out.println("Deserialization error: " + e.getMessage());
	        }
		System.out.print("Deserialized Book: ");
	      System.out.print(obj);
		 
		
		
	}

}
