import java.text.NumberFormat;
public class Register {
	//fields
	private final double TAX = 0.06;//sales tax
	private double Subtotal;
	private double total;
	private NumberFormat  numForm=NumberFormat.getCurrencyInstance()
	
	order order=new Order();
	
	//constructors
 public  Register (Order order)
 {
	 this.order = order;
	 order.incrementNO();
 }
 
 
 //accessors
 
 public double getSubtotal(){
	 return Subtotal;
	 
 }
 public double getTax(){
	 return TAX;
 }
 
 public double getTotal(){
	 return total;
 }
 //calc
 public double calcSubtotal(){
	 for(int i=0;i<order.getSize();i++){
		 Item item=order.getItem(i);
		 Subtotal =+item.getprice();
		 }
	 return Subtotal;
 }
 
 public double calcTax(){
	 return Subtotal*TAX;
 }
 public double calcTotal(){
	 total= Subtotal+ calcTax();
	 return total; 
 }
 
 public void clearPayments(){
	 Subtotal=0;
	 total=0;
	 
 }
 public String checkPayment(double payment){
	 if(payment == total){
		 return "Enough money tendered";
		 
	 }
	 else if (payment>total){
		 return "Here is your change ;"+numForm.format(payment - total);
		 
	 }
	 else {
		 return "please pay " + numForm.format(total-payment)+ " more.";
	 }
 }
 
 
 
 public String toString(){
	 String str ="_________MahiResturant____________ \n"
	 		+  "Order No" + order.getNumber() + "\n"
	 		+"Server Name:" + order.getServer()+"\n"
	 		
	 		str +=order.toString();
	     str+= "___________________________"
	    		 +"subtotal :\t\t\t" +numForm.format(calcSubtotal());
	          + "\nTax : \t\t\t " +numForm.format(calcTax())
	          + "Total : \t\t\t" +numForm.format(calcTotal());
	          return str;
 }
 
 
}
