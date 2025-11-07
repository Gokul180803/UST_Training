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
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("PublicationYear : "+publicationYear);
	}
}
public class ClassStructure {

	
	public static void main(String[] args) {
		Book b =new Book("java","gokul",2026);
		System.out.println("------- Book1 ----------");
		b.displayBookInfo();
		System.out.println(b.getPublicationYear());
		System.out.println("------- Book2 ----------");
		Book b1=new Book("c++","nithin",2000);
		b1.displayBookInfo();
		System.out.println(b1.getPublicationYear());
		
		
		
	}

}
