
public class Goldfinch extends Animal implements Flyable, Walkable {

	private double wingSpan;
	
	public Goldfinch() {
		super();
		wingSpan=9.0;
	}//end empty-argument constructor
	
	public Goldfinch(int simID, Location l, double wingSpan) {
		super.setSimID(simID);
		super.setLocation(l);
		super.full=false;
		super.rested=true;
		this.setWingSpan(wingSpan);
	}//end preferred constructor
	
	@Override
	public void fly(Location l) {
		
		this.location=l;
		System.out.println("The goldfinch flew to "+location+".");
		
	}//end fly

	@Override
	public void walk(int direction) {
		
		int x, y;
		x=location.getxCoord();
		y=location.getyCoord();
		
		x=x+direction;
		y=y+direction;
		
		location.update(x, y);
		System.out.println("The goldfinch walked to "+location.toString()+".");
		
	}//end walk

	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	public void setWingSpan(double wingSpan) {
		
		try {
			if (wingSpan<=11.0 && wingSpan>=5.0) this.wingSpan = wingSpan;
			else throw new InvalidWingspanException("Wingspan must be between 5.0 and 11.0cm!");
		}
		catch (InvalidWingspanException e) {
			System.out.println(e.getMessage());
		}
	}//end setWingSpan

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", " + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
	
}//end class
