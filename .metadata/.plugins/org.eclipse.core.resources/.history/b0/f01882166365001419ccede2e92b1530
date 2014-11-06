/**
 * 
 * @author Derek Wider
 *
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

   public double getTotalPrice(){ //z
	   return widgets * (getUnitDiscount()/100);
   }
//add local price int
   /*public double getUnitDiscount(){
	   double price = this.price;
	   if(widgets > 10000){
		   int remainder = widgets - 10000;
		   remainder = ((int) remainder/1000)*10;
		   if(remainder > (.5*price)){
			   price = price*.5;
		   }
		   else{
			   price = price - remainder;
		   }
	   }
	   return price;
   }*/
   public double getUnitDiscount(){
	   double price = this.price;
	   if(widgets > 10000){
		   if(widgets > 20000){
			   if(widgets > 50000){
				   price -= 20;
			   }
			   else{
				   price -= 10;
			   }
		   }
		   else{
			   price -= 5;
		   }
	   }
	   return price;
   }
}
