import java.io.IOException;

public class BookShop {

	public static void main(String[] args) throws IOException 
	{
		BookShopMaintainance bs = new BookShopMaintainance();
		
		bs.noOfBooksInShopWantToEnter();
		bs.spaceCreation();
		bs.booksInfoInput();
		bs.display();
		bs.searchABookYouWant();

	}

}
