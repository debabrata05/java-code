
public class BooksDetails 
{
	private String author;
	private String title;
	private double price;
	private String publisher;
	private int stockStatus;
	private int totalBooks;
	private int sold;
	private String titleOfBookWant;
	private String authorOfBookWant;
	private double totalCost;
	
	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getTitleOfBookWant() {
		return titleOfBookWant;
	}

	public void setTitleOfBookWant(String titleOfBookWant) {
		this.titleOfBookWant = titleOfBookWant;
	}

	public String getAuthorOfBookWant() {
		return authorOfBookWant;
	}

	public void setAuthorOfBookWant(String authorOfBookWant) {
		this.authorOfBookWant = authorOfBookWant;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int i) {
		this.sold = i;
	}

	public String getAuthor() {
		return author;
	}
	
	public int getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getStockStatus() {
		return stockStatus;
	}
	
	public void setStockStatus(int d) {
		this.stockStatus = d;
	}
	
	
}
