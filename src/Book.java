
public class Book {
	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInStock;
	
	public Book(){
		this.title = "Blank Book";
		this.author = "noone";
	}
	public Book(String title, String author, String description){
		this.title = title;
		this.author = author;
		this.description = description;
	}
	public Book(String title, String author, String description, double price, boolean isInStock){
		this.title = title;
		this.author = author;
		this.description = description;
		this.price = price;
		this.isInStock = isInStock;
	}
	
	public void getDisplayText(){
		System.out.println("Author: " + author);
		System.out.println("Title: " + title);
		System.out.println("Summery: " + description);
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isInStock() {
		return isInStock;
	}
	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}
	
}

//The Book class shall contain private member variables, a default constructor, 
//an overloaded constructor and a method called getDisplayText() which prints the author, title and description.
// Book title, author, description, price and isInStock variables
