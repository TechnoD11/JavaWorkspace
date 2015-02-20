package saveMyHeart1;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

import saveMyHeart.Bacteria;
import saveMyHeart.Heart;
//import saveMyHeart.WhiteBloodCellCritter;

public class Bacteria1 extends Bacteria{
	int count=0;
	boolean simulationHasEnded=false;
    private static final Color DEFAULT_COLOR = Color.BLUE;
    /**
     * Constructs a blue bacteria.
     */
    public Bacteria1()
    {
        setColor(DEFAULT_COLOR);
    }
    /**
     * Constructs a bacteria of a given color.
     * @param bacColor the color of this bacteria
     */
    public Bacteria1(Color bacColor)
    {
        setColor(bacColor);
    }
    /**
     * Overrides the <code>act</code> method in the <code>Actor</code> class
     * to do stuff.
     */
    //the main act method.
    public void act()
    {
    	if (findHeartLocation()==null)return;//if there is no heart do nothing
    	if(withenWBCDistance()&&!simulationHasEnded){
    		//System.out.println("WITHEN"+count++); This was for debuging
    		this.setDirection((this.getLocation().getDirectionToward(findWBCCLocation())+180)%360);
    		Location locer = this.getLocation().getAdjacentLocation(this.getDirection());
    		if(getGrid().isValid(locer))
    			moveTo(locer);
    		return;
    	}
    if(nextToHeartLocation(findHeartLocation())){//if you are next to the heart,
    	for(Actor daActor : getGrid().getNeighbors(this.getLocation())){
    		if (daActor instanceof Heart)daActor.setColor(Color.BLACK);
    		simulationHasEnded=true;//turn it black
    	}
    }
    
    else{this.setDirection(this.getLocation().getDirectionToward(findHeartLocation()));//else, set your direction
    //towards the heart
    	moveTo(this.getLocation().getAdjacentLocation(getDirection()));//and move to it
    	} //set direction to heart and move to it
    }
    //finds the heart location
    public Location findHeartLocation(){
	for (Location loc : getGrid().getOccupiedLocations()){
    		if (getGrid().get(loc) instanceof Heart)
			return loc;
		}//if it's an instance of the heart,
		//then return that you found the heart
    	return null;//else, return nothing
    }
    //returns true if this bacteria is next to the heart
    public boolean nextToHeartLocation(Location heartLocation){
    	for(Location loc : getGrid().getOccupiedAdjacentLocations(heartLocation))
    		if(this.getLocation().equals(loc)) return true;//if YOU are next to the HEART, return true.
    	return false;//else, return false
    }
    //finds the location of the WBC
    public Location findWBCCLocation(){
    	for (Location loc : getGrid().getOccupiedLocations()){ 
        		if (getGrid().get(loc) instanceof WhiteBloodCellCritter){
    			return loc;
        		}
    		}//if it's an instance of the WBC,
    		//then return it
        	return null;//else, return nothing
        }
    //build the 5x5 grid that the bacteria can "see" from
public ArrayList<Location> getMoveLocations()
{
    ArrayList<Location> placesFromWBC = new ArrayList<Location>();
    Location bacLocation = this.getLocation();
    int bacRow = bacLocation.getRow();
    int bacCol = bacLocation.getCol();
    for(int i = bacCol-2; i<=bacCol+2; i++)
    {
    	for(int j = bacRow-2; j<=bacRow+2; j++)
    	{
    		placesFromWBC.add(new Location(j, i));
    	}
    }
    for(int i = 0; i<placesFromWBC.size()-1;i++){
    	if(placesFromWBC.get(i).equals(bacLocation))placesFromWBC.remove(i);
    }
    return placesFromWBC;
}
//returns true if it is withen the WBC distance
public boolean withenWBCDistance(){
	ArrayList<Location> someLocations = getMoveLocations();
	Location WBCLocation = findWBCCLocation();
	for(Location location : someLocations){
		if(location.equals(WBCLocation))return true;
	}
	return false;
}
}
/*
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Location getWhiteBloodCellLocation(){
		ArrayList<Location> occupiedSpots = getGrid().getOccupiedLocations(); //array of occupied grid locations
		for(Location myLoc : occupiedSpots){
			if(getGrid().get(myLoc) instanceof WhiteBloodCellCritter){ //if one of the locations is an instance of the WhiteBloodCell class, return true
				return myLoc;
			}
		}
		return null; //if none found, return null
	}
	public void act(){
		
		if (getHeartLocation()==null)return;//if there is no heart do nothing
    	if(isWhiteBloodCellSeen()){
    		//System.out.println("WITHEN"+count++); This was for debuging
    		this.setDirection((this.getLocation().getDirectionToward(getWhiteBloodCellLocation())+180)%360);
    		Location locer = this.getLocation().getAdjacentLocation(this.getDirection());
    		if(getGrid().isValid(locer))
    			moveTo(locer);
    		return;
    	}
		
		
		
		/*Location loc = this.getLocation(); //get the current bacteria location
		if(isInTerminationLocation(loc)){ //if the current position is in a adjacent location to the heart
			getGrid().get(getHeartLocation()).setColor(Color.BLACK); //set it to black
		}
		else if(isWhiteBloodCellSeen()){
			int direction = 180 - loc.getDirectionToward(getWhiteBloodCellLocation());
			Location next = loc.getAdjacentLocation(direction);
			this.setDirection(loc.getDirectionToward(getHeartLocation()));
			if(getGrid().isValid(next)){
				moveTo(next);	
			}
		}
		else{ //if not
			Location next = loc.getAdjacentLocation(loc.getDirectionToward(getHeartLocation()));
			if (getGrid().isValid(next) && getGrid().get(next) == null){ //generate next location based on heart position
				setDirection(loc.getDirectionToward(getHeartLocation()));
				moveTo(next); //rotate and move towards heart
			}
		}
	}
	public boolean isWhiteBloodCellSeen(){ //determines if the bacteria sees the white blood cell
		ArrayList<Location> placesFromWBC = new ArrayList<Location>();
		Location bacLocation = this.getLocation();
		int bacRow = bacLocation.getRow();
		int bacCol = bacLocation.getCol();
		for (int i = bacCol - 2; i <= bacCol + 2; i++) {
			for (int j = bacRow - 2; j <= bacRow + 2; j++) {
				placesFromWBC.add(new Location(j, i));
			}
		}
		for (int i = placesFromWBC.size() - 1; i >=0; i--) {
			if (placesFromWBC.get(i).equals(bacLocation))
				placesFromWBC.remove(i);
		}

		Location WBCLocation = getWhiteBloodCellLocation();
		for (Location location : placesFromWBC) {
			if (location.equals(WBCLocation))
				return true;
		}
		return false;
	}
}*/