import java.util.Random;

public abstract class Animal {

	protected int simID;
	protected Location location;
	protected boolean full, rested;
	
	public Animal() {
		simID=0;
		location=new Location(0,0);
		full=false;
		rested=true;
	}//end empty-argument constructor
	
	public Animal(int simID, Location l) {
		
		this.setSimID(simID);
		this.setLocation(location);
		full=false;
		rested=true;
	}//end preferred constructor
	
	public boolean eat() {
		Random r=new Random();
		
		double amountFed=r.nextDouble(1);
		if (amountFed<=0.5) {
			full=false;
			System.out.println("This animal is still hungry.");
		}
		else {
			full=true;
			System.out.println("This animal is full.");
		}
				
		return full;
	}//end eat
	
	public boolean sleep() {
		Random r=new Random();
		
		double amountSlept=r.nextDouble(1);
		if (amountSlept<=0.5) {
			rested=false;
			System.out.println("This animal is still tired.");
		}
		else {
			rested=true;
			System.out.println("This animal is well-rested.");
		}
		
		return rested;
	}//end sleep

	public int getSimID() {
		return simID;
	}//end getSimID

	public void setSimID(int simID) {
		try {
			if (simID>0)
				this.simID=simID;
			else throw new InvalidSimIDException("SimID must be greater than zero!");
		}
		catch(InvalidSimIDException e) {
			System.out.println(e.getMessage());
		}
	}//end setSimID

	public Location getLocation() {
		return location;
	}//end getLocation

	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation

	public boolean isFull() {
		return full;
	}//end isFull

	public void setFull(boolean full) {
		this.full = full;
	}//end setFull

	public boolean isRested() {
		return rested;
	}//end isRested

	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested
	
}//end class
