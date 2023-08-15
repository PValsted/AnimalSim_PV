import java.util.Arrays;

public class Location {
	
	private int xCoord, yCoord;
	
	public Location() {
		xCoord=0;
		yCoord=0;
	}//end empty-argument constructor
	
	public Location (int x, int y) {
		
		try {
			if (x>=0 && y>=0) {
				this.setxCoord(x);
				this.setyCoord(y);
			}
			else 
				throw new InvalidCoordinateException("Coordinates cannot be less than zero!");
		}
		catch (InvalidCoordinateException e) {
			System.out.println(e.getMessage());
		}
		
	}//end preferred constructor
	
	public void update (int x, int y) {
		
		try {
			if (x>=0 && y>=0) {
				this.setxCoord(x);
				this.setyCoord(y);
			}
			else 
				throw new InvalidCoordinateException("Coordinates cannot be less than zero!");
		}
		catch (InvalidCoordinateException e) {
			System.out.println(e.getMessage());
		}
		
	}//end update
	
	public int[] getCoordinates() {
		int[] coordArray= {xCoord, yCoord};
		return coordArray;
	}//end getCoordinates

	public int getxCoord() {
		return xCoord;
	}//end getxCoord

	private void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}//end setxCoord

	public int getyCoord() {
		return yCoord;
	}//end getyCoord

	private void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}//end setyCoord

	@Override
	public String toString() {
		return "Location [Coordinates="
				+ Arrays.toString(getCoordinates()) + "]";
	}//end toString
	
}//end class
