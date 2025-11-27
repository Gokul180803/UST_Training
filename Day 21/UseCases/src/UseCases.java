import java.io.Serializable;

class Book implements Serializable{
	String title;
	String author;
	String isbn;
	double price;
	public Book(String title, String author, String isbn, double price) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
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
				", ISBN: " + isbn+
	               ", Price: $" + price ;
	}
}
public class UseCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
