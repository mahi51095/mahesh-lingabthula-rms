import java.util.ArrayList;
import java.util.Random;
public class order {
	// fields
	private static int orderNo=0;
	private ArrayList<Item> order=new private ArrayList<Item>();
	
	
	//constructors
	public order(){}
	
	
	
	
	
	//accessors
	
	//get item from order
	
	public Item getItem(int index){
		return order.get(index);
	}
	
	//add item to order
	
	public void addItem(Item item){
		order.add(item);
	}
	
	
	
	//methods
	//remove an item from order
	
	public void removeItem(Item item){
		order.remove(item);
	}
	//get order size, or no of items in order
	
	public int getSize(){
		return order.size();
	}
	// clears the order
	public void clearOrder(){
		order.clear();
	}
	//get the order number
	
	public int getNumber(){
		return orderNo;
	}
	// increment order number
	
	public void incrementNO(){
		orderNo++;
	}
	
	//gets a random server for the order
	
	public string getServer(){
		Random rand=new Random();
		int num=rand.nextInt(10) + 1;
		switch(num){
			case 1:
			return "harish";
			break;
			case 2:
			return "madhu";
			break;
			case 3:
			return "john";
			break;
			case 4:
			return "mahesh";
			break;
			case 5:
			return "manoj";
			break;
			default:
			return "no server";
			break;
		}
	}
	//to string
	
	public String toString(){
		String str = "";
		for(int i=0;i<order.size();i++){
			str += order.get(i).toString() + "\n\n";
		}//end of loop
		return str;
	}

}
