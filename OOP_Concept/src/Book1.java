
public class Book1 {
	private String title;
	private Author author;
	private int page;
	
	
	
	public  Book1 (String title, Author author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
   }
	
	public Book1(String title , Author author) {
		this.title = title;
		this.author = author;
		this.page = 0;
	}
	
	public Book1() {
		this.title = "";
		this.author = null;
		this.page = 0;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Author author() {
		return this.author;
		
	}
	
	public void setPage(int page) {
		this.page = page;
	
	}
	public int getPage(int page) {
		return this.page;
		
	}
	public String toString() {
		return title +" has "+page+" pages write by "+author;
   	 
    }

	
}









