import java.text.DecimalFormat;

/**
 * 
 * @author Derek Wider
 *
 */
public class RoomPainter {
	private int gallons = 0; 
	private int quarts = 0;
	private final int FEET_TO_GALLONS = 350;
	private final double COST_GALLONS = 32.0;
	private final double COST_QUARTS = 10.0;
	private final double SALES_TAX = 1.097;
	DecimalFormat df = new DecimalFormat("#.##");
	public RoomPainter(){;}
	public void printData(int height, int length, int width, int numDoors, int numWindows){
		double area = ((2 * length * height) + (2 * width * height)) - ((numDoors * 20) + (numWindows * 15));
		gallons = (int) Math.round(area/FEET_TO_GALLONS); //is this correct?
		if((gallons * FEET_TO_GALLONS) < area){
			double quartsDouble = ((area % FEET_TO_GALLONS)/(FEET_TO_GALLONS/4));
			quarts = (int) quartsDouble + 1;
		}
		else{
			quarts = 0;
		}
		double cost = SALES_TAX * ((gallons * COST_GALLONS) + (quarts * COST_QUARTS));
		cost = Double.parseDouble(df.format(cost));
		System.out.println("Your Room Information: Height: " + height + " Length: " + length + " Width: " + width + " With " + numDoors + " Door(s) and " + numWindows + " Window(s)");
		System.out.println("You will need to purchase " + gallons + " gallons(s) and " + quarts + " quart(s) of paint");
		System.out.println("Your total cost will be: $" + cost);
	}
}
