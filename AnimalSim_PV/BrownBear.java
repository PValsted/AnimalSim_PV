
public class BrownBear extends Animal implements Walkable, Swimmable {

	private String subSpecies;
	
	public BrownBear() {
		super();
		subSpecies="Alaskan";
	}//end empty-argument constructor
	
	public BrownBear(int simID, Location l, String subSpecies) {
		super.setSimID(simID);
		super.setLocation(l);
		super.full=false;
		super.rested=true;
		this.setSubSpecies(subSpecies);
	}//end preferred constructor
	
	@Override
	public void swim(int direction) {
		
		int x, y;
		x=location.getxCoord();
		y=location.getyCoord();
		
		x=x+(direction*2);
		y=y+(direction*2);
		
		location.update(x, y);
		System.out.println("The bear swam to "+location.toString()+".");
		
	}//end swim

	@Override
	public void walk(int direction) {
		
		int x, y;
		x=location.getxCoord();
		y=location.getyCoord();
		
		x=x+(direction*3);
		y=y+(direction*3);
		
		location.update(x, y);
		System.out.println("The bear walked to "+location.toString()+".");
		
	}//end walk

	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	public void setSubSpecies(String subSpecies) {
		
		subSpecies=subSpecies.toLowerCase();		
		
		try{
			switch(subSpecies) {
		
			case "alaskan":
				this.subSpecies= "Alaskan";
				break;
			case "asiatic":
				this.subSpecies= "Asiatic";
				break;
			case "european":
				this.subSpecies= "European";
				break;
			case "grizzly":
				this.subSpecies= "Grizzly";
				break;
			case "kodiak":
				this.subSpecies= "Kodiak";
				break;
			case "siberian":
				this.subSpecies= "Siberian";
				break;
			default:
				throw new InvalidSubspeciesException(subSpecies + " is not a valid subspecies.");
			}//end switch
		}
		catch (InvalidSubspeciesException e) {
			System.out.println(e.toString());
		}
		
	}//end setSubSpecies

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", " + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
	
}//end class
