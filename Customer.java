import java.util.Scanner;


public class Customer{
	public static void main (String[] args){
	
 menu menu=new menu();
 int s=menu.getStartersSize();
 System.out.println("Starters :"+s);
 Item item1=menu.getStarters(1);

	System.out.println(item1);
	
	
	
	Scanner  reader=new Scanner(System.in);
	// prints out a greeting
	
	System.out.println("Welcome to Mahi Restaurant!!");
	System.out.println("We serve a variety of dishes of india");
	System.out.println();
	
	// get a menu
	
	menu m=new menu();
	System.out.println(menu);
	
	
	
	// read full menu
	System.out.println("Would you like to view full menu or just a section? [FULL] [SEC]");
	// get the answer
	
	String answer=reader.next();
	//check for answer
	
	while(!(answer.equalsIgnoreCase("full")|| answer.equalsIgnoreCase("sec")))
		System.out.println("Invalid input please enter again");
		answer=reader.next();// rescans input
	// read a section
	
	System.out.println("Which section ? [Starters] [main course] [beverages] [desserts] [icecreams]");
	String section = reader.next().toLowerCase();
	// place an order
	
	order order=new order();
	
	
	
	
		
	}
}
