import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product{
	//Properties
	public String pname;
	public int qty;
	public double price;
	public double totalPrice;
	
	
	public Product(String productName, int quantity, double price2, double totalPrice2) {
		// TODO Auto-generated constructor stub
	}


	//Constructor
	void Product(String pname, int qty, double price, double totalPrice)
	{
		this.pname=pname;
		this.qty=qty;
		this.price=price;
		this.totalPrice=totalPrice;
	}
	
	
	//getter methods
	public String getPname() {
	    return pname;
	  }
	  public int getQty() {
	    return qty;
	  }
	  public double getPrice() {
	    return price;
	  }
	  public double getTotalPrice() {
	    return totalPrice;
	  }
	  
	// displayFormat
	  public static void displayFormat() {
	    System.out.print(
	        "\nName      Quantity    Price   Total Price\n");
	  }

	  // display
	  public void display() {
	    System.out.format("%-9s %8d %10.2f %10.2f\n", 
	         pname, qty, price, totalPrice);
	  }
}
public class Food_system {

	
	public static void main(String[] args) {
		// variables
	    String productName ;
	    int quantity; 
	    double price ;
	    double totalPrice ;
	    double overAllPrice = 0 ;
	    char choice ;

	    // create Scanner class object
	    Scanner scan = new Scanner(System.in);

	    List<Product> product = new ArrayList<Product>();

	    do {
	      // read input values
	      System.out.println("Enter product details,");
	      System.out.print("Name: ");
	      productName = scan.nextLine();
	      System.out.print("Quantity: ");
	      quantity = scan.nextInt();
	      System.out.print("Price (per item): ");
	      price = scan.nextDouble();

	      // calculate total price for that product
	      totalPrice = price * quantity;

	      // calculate overall price
	      overAllPrice += totalPrice;

	      // create Product class object and add it to the list
	      product.add( new Product(productName, quantity, price, totalPrice) );

	      // ask for continue?
	      System.out.print("Want to add more item? (y or n): ");
	      choice = scan.next().charAt(0);

	      // read remaining characters, don't store (no use)
	      scan.nextLine();
	    } while (choice == 'y' || choice == 'Y');

	    // display all product with its properties
	    Product.displayFormat();
	    for (Product p : product) {
	      p.display();
	    }

	    // overall price
	    System.out.println("\nTotal Price = " + overAllPrice);

	    // close Scanner
	    scan.close();

	}

}
