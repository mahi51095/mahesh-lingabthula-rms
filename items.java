import java.text.NumberFormat;
public class items {
	private String name;
	private String category;
	private double price;
	private String size;
	NumberFormat numForm=NumberFormat.getCurencyInstance();
	
	//constructors
	
	public items(String name,String category,double price){
		this.name=name;
		this.category=category;
		this.price=price;
	}
	public items(String name,String category,double price,string size){
		this.name=name;
		this.category=category;
		this.price=price;
		this.size=size;
		
	}
	
	// accessors
	
	public double getprice()
	{
		return price;
	}
	public void setprice(double price){
		this.price=price;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public string getcategory(){
		return category;
	}
	public void setCategor(String category){
		this.category=category;
	}
	public string size(){
		retirn size;
	}
	public void setSize(String size){
		this.size=size;
	}
	// toString method
	  public string toString(){
		  if(size !=null){
			  return "(" + size +")" + name + "\t" + numForm.format(price){
			  else{
				  return name + "\t" + numForm.format(price);
			  }
			  }
		  }
		
	}
	
	

}
