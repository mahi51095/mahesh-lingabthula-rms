 import java.util.ArrayList;
public class menu {
	
	//fields
	 private ArrayList<Item> Starters=new ArrayList<Item>();
	 private ArrayList<Item> maincourse=new ArrayList<Item>();
	 private ArrayList<Item> beverages=new ArrayList<Item>();
	 private ArrayList<Item> desserts=new ArrayList<Item>();
	 private ArrayList<Item> icecream=new ArrayList<Item>();
	 
	 // constructors
	 public menu(){
		 populateMenu();
	 }
	  // return a specific starters
	  public Item getStarters(int index){
		  return Starters.get(index);
	  }
	  // returns the size of the starters
	  public int getStartersSize(){
		  return Starters.size();
	  }
	  
	  
	  // returns all starters as a string
	  
	 
	//methods
	 public void populateMenu(){
		 //Starters
		Starters.add(new Item("chicken manuchuria \t\t","starters", 60));
		Starters.add(new Item("chicken 65 \t\t ", " Starters",70));
		Starters.add(new Item("veg maunchuria \t\t"," Starters", 45));
		
		//main course
		maincourse.add(new Item("chicken biryani single \t\t","maincourse",100));
		maincourse.add(new Item("chicken biryani family \t\t","maincourse",300));
		maincourse.add(new Item("Mutton biryani single \t\t","maincourse",130));
		maincourse.add(new Item("Mutton biryani family \t\t","maincourse",350));
		
		//beverages
		beverages.add(new Item("pepsi \t\t","beverages",25));
		beverages.add(new Item("coca cola \t\t","beverages",25));
		beverages.add(new Item("Thumps up \t\t","beverages",25));
		beverages.add(new Item("sprite \t\t","beverages",25));
		
		//desserts
		desserts.add(new Item("qurbani ka meta \t\t","desserts",40));
		desserts.add(new Item("dauble ka meta \t\t","desserts",40));
		
		//ice creams
		icecream.add(new Item("butter scotch \t\t","icecream",30));
		icecream.add(new Item("vennila \t\t","icecream",30));
		
		
	 
		  
	 }

}
