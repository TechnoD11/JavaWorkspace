/**
 * 
 * @author Derek Wider
 * APCS lab 7.1
 * 11/5/14
 */
public class Order{
   private int widgets; 
   private double price; //instance fields
   public Order(double undiscountedUnitPrice){
	   widgets = 0;
	   price = undiscountedUnitPrice; //constructor, sets the undiscounted unit price to the instance field
   }

   public void addWidgets(int quantity){
	   widgets = widgets+quantity; // adds the quantity to the widgets instance field
   }

   public double getTotalPrice(boolean discountedType){ //calculated the discounted price, based on rate choice (boolean)
	   return widgets * (getUnitDiscount(discountedType)/100);
   }
   public double getUnitDiscount(boolean discountType){ 
	   double price = this.price; 
	   if(discountType == true){ //if the first type of discount is to be used
		   if(widgets > 10000){
			   int remainder = widgets - 10000; 
			   remainder = ((int) remainder/1000)*10; //use remainder to calculate $ discount
			   if(remainder > (.5*price)){ //if its greater than 50%
				   price = price*.5;
			   }
			   else{
				   price = price - remainder; //if its less than 50%
			   }
		   }
		   return price;
	   }
	   else{ //if the second kind of discount is to be used
		   if(widgets > 10000){ //if greater than 10000
			   if(widgets > 20000){ //and 20000
				   if(widgets > 50000){ //and 50000
					   price -= 20; //discount 20
				   }
				   else{
					   price -= 10; //discount 10
				   }
			   }
			   else{
				   price -= 5; //discount 5
			   }
		   }
		   return price;
	   }
	   
   }
}
