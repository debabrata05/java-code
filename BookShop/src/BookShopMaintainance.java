import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BookShopMaintainance 
{
	BooksDetails bi = new BooksDetails();
	
	BooksDetails bd = new BooksDetails();
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Scanner sc = new Scanner(System.in);
	
	BooksDetails[] Books = new BooksDetails[bi.getTotalBooks()];
	
	public void noOfBooksInShopWantToEnter()
	{
		System.out.println("Enter total number of distinct books details you want to enter: ");
		bi.setTotalBooks(sc.nextInt());
		
	}

	public void spaceCreation()
	{
		Books=new BooksDetails[bi.getTotalBooks()];
		
	}
	
	public void booksInfoInput() throws IOException
	{
		
		for(int i=0;i<bi.getTotalBooks();i++)
		{
			Books[i] = new BooksDetails();
			System.out.println("Title: ");
			Books[i].setTitle(br.readLine());
			
			System.out.println("Author: ");
			Books[i].setAuthor(br.readLine());
			
			System.out.println("Publisher: ");
			Books[i].setPublisher(br.readLine());
			
			System.out.println("price: ");
			Books[i].setPrice(sc.nextDouble());
			
			System.out.println("Enter number of copies: ");
			Books[i].setStockStatus(sc.nextInt());
			
			System.out.println("\n\n");
		}
	}
	
	public void bookSold(String title,String author)
	{
		System.out.println("Enter the number of copies sold: ");
		bi.setSold(sc.nextInt());;
		for(int i=0;i<Books.length;i++)
		{
			if((Books[i].getTitle().equals(title)) && (Books[i].getAuthor().equals(author)))
			{
				Books[i].setStockStatus(Books[i].getStockStatus()-bi.getSold());
				bi.setTotalCost(Books[i].getPrice()*bi.getSold());
				break;
			}
		}
		
	}
	
	public void searchABookYouWant() throws IOException
	{
		System.out.println("Enter the title of book u want: ");
		bi.setTitleOfBookWant(br.readLine());
		System.out.println("Enter the Author of book u want: ");
		bi.setAuthorOfBookWant(br.readLine());
		int flag=0;
		for(int i=0;i<Books.length;i++)
		{
			if((Books[i].getTitle().equals(bi.getTitleOfBookWant())) && (Books[i].getAuthor().equals(bi.getAuthorOfBookWant())) && (Books[i].getStockStatus()>0))
			{
				bd=Books[i];
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Book is found");

			bookSold(bi.getTitleOfBookWant(),bi.getAuthorOfBookWant());
			
			display(bd);
		}
		else
			System.out.println("Book is not found");
	}
	
	public void display()
	{
		for(BooksDetails b: Books)
		{
			System.out.println("Title: " + b.getTitle());
			System.out.println("Author: " + b.getAuthor());
			System.out.println("Publisher: " + b.getPublisher());
			System.out.println("price: " + b.getPrice());
			System.out.println("Avaiable: " + b.getStockStatus());
			System.out.println("\n\n");
		}
	}
	
	public void display(BooksDetails bd)
	{
			System.out.println("Info of the Sold book ");
			System.out.println("Title: " + bd.getTitle() );
			System.out.println("Author: " + bd.getAuthor() );
			System.out.println("Total Cost: " + bi.getTotalCost());
			System.out.println("\n\n");
	}

}
