 class Book{
	private String title;
	private String author;
	private int publicationYear;
	 Book(String title, String author,int publicationYear){
		 this.title=title;
		 this.author=author;
		 this.publicationYear=publicationYear;
	 }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear=publicationYear;
	}
	public void displayBookInfo() {
		System.out.println("Book :"+title);
	}
}
public class MultipleInstantiateObjects {

	
	public static void main(String[] args) {
		Book b =new Book("java","Jane Austen",1813);
		System.out.println("------- Book1 ----------");
		b.displayBookInfo();
		
		System.out.println("------- Book2 ----------");
		Book b1=new Book("c++","George Orwell",1949);
		b1.displayBookInfo();
		System.out.println("------- Book3 ----------");
	
		Book b2=new Book("c#","J.K. Rowling",1997);
		b2.displayBookInfo();
		
		
		
		
	}

}
