import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{
	String title;
	String author;
	double price;
	String isbn;
	public Book(String title, String author, double price, String isbn) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "Book: " + title + " by " + author +
	               ", Price: $" + price +
	               ", ISBN: " + isbn;
	}
}
public class Serializables {

	public static void main(String[] args) {
		  Book originalBook = new Book("Effective Java", "Joshua Bloch", 45.99, "978-0134685991");

	        // Print original data
	        System.out.println("Original Book:");
	        System.out.println(originalBook);

	        // Serialize the object
	        try (FileOutputStream fos = new FileOutputStream("book.ser");
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

	            oos.writeObject(originalBook);
	            System.out.println("Book serialized successfully!");
	        } catch (IOException e) {
	            System.out.println("Serialization error: " + e.getMessage());
	        }

	        // Deserialize the object
	        Book deserializedBook = null;
	        try (FileInputStream fis = new FileInputStream("book.ser");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {

	            deserializedBook = (Book) ois.readObject();
	            System.out.println("Book deserialized successfully!");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Deserialization error: " + e.getMessage());
	        }

	        // Print deserialized data
	        System.out.println("Deserialized Book:");
	        System.out.println(deserializedBook);

	        // Verify
	        if (originalBook.toString().equals(deserializedBook.toString())) {
	            System.out.println("Verification successful: Original and deserialized book details match!");
	        } else {
	            System.out.println("Verification failed: Data mismatch.");
	        }
	    }
	}
		
