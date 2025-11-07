 class Book1{
	private String title;
	private String author;
	private int publicationYear;
	 Book1(String title, String author,int publicationYear){
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
		System.out.println("Title : "+title+" Author : "+author+" Year : "+publicationYear);
	}
}
public class InstantiateObjects {

	
	public static void main(String[] args) {
		Book1 b =new Book1("java","gokul",2026);
		System.out.println("------- Book1 ----------");
		b.displayBookInfo();
		System.out.println(b.getPublicationYear());
		System.out.println("------- Book2 ----------");
		Book1 b1=new Book1("c++","nithin",2000);
		b1.displayBookInfo();
		System.out.println(b1.getPublicationYear());
		
		
		
	}

}
