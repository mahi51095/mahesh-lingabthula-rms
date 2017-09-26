 import java.util.ArrayList;
public class menu {
	
	//fields
	 private ArrayList<items> Starters=new ArrayList<items>();
	 private ArrayList<items> maincourse=new ArrayList<items>();
	 private ArrayList<items> beverages=new ArrayList<items>();
	 private ArrayList<items> desserts=new ArrayList<items>();
	 private ArrayList<items> icecream=new ArrayList<items>();
	 
	 // constructors
	 public menu(){
		 populateMenu();
	 }
		 
	 }
	
	 public void populateMenu(){
		 //Starters
		Starters.add(new items("chicken manuchuria","starters", 60));
		Starters.add(new items("chicken 65" " Starters",70));
		Starters.add(new items("veg maunchuria"," Starters", 45));
		
		//main course
		maincourse.add(new items("chicken biryani single","maincourse",100));
		maincourse.add(new items("chicken biryani family","maincourse",300));
		maincourse.add(new items("Mutton biryani single","maincourse",130));
		maincourse.add(new items("Mutton biryani family","maincourse",350));
		
		//beverages
		beverages.add(new items("pepsi","beverages",25));
		beverages.add(new items("coca cola","beverages",25));
		beverages.add(new items("Thumps up","beverages",25));
		beverages.add(new items("sprite","beverages",25));
		
		//desserts
		desserts.add(new items("qurbani ka meta","desserts",40));
		desserts.add(new items("dauble ka meta","desserts",40));
		
		//ice creams
		icecream.add(new items("butter scotch","icecream",30));
		icecream.add(new items("vennila","icecream",30));
		
		
	 
		  
	

}
