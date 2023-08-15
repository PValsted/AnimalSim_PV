import java.util.Arrays;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("*********************************************\n");
		sb.append("               Location Tests                \n");
		sb.append("*********************************************\n");
		System.out.println(sb);
		
		Location loc1 = new Location();
		System.out.println(loc1);
		Location loc2 = new Location(-1, 2);
		Location loc3 = new Location(2, 2);
		System.out.println(loc3);
		loc3.update(-1, 3);
		loc3.update(3, 3);
		System.out.println(loc3.getxCoord());
		System.out.println(loc3.getyCoord());
		System.out.println(Arrays.toString(loc3.getCoordinates())+"\n");
		
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("*********************************************\n");
		sb2.append("                Animal Tests                 \n");
		sb2.append("*********************************************\n\n");
		System.out.println(sb2);
		//Animal a= new Animal();
		
		// Since the animal object cannot be instantiated, testing of the methods in the 
		// animal class is done below in the goldfinch section.
		
		
		StringBuilder sb3 = new StringBuilder();
		sb3.append("*********************************************\n");
		sb3.append("               Goldfinch Tests               \n");
		sb3.append("*********************************************\n");
		System.out.println(sb3);
		
		Goldfinch gf=new Goldfinch();
		System.out.println(gf);
		
		Goldfinch gf2=new Goldfinch(-1, new Location(3,-1), 4.3);
		
		Goldfinch gf3=new Goldfinch(1, new Location(3,4), 8.9);
		
		gf3.setSimID(2);
		System.out.println(gf3.getSimID());
		
		gf3.setLocation(new Location(4,5));
		System.out.println(gf3.getLocation());
		
		gf3.eat();
		System.out.println(gf3.full);
		
		gf3.sleep();
		System.out.println(gf3.rested);
		
		gf3.setRested(false);
		System.out.println(gf3.rested);
		
		gf3.setFull(false);
		System.out.println(gf3.full);
		
		gf3.setWingSpan(5.6);
		System.out.println(gf3.getWingSpan());
		
		System.out.println(gf3);
		
		gf3.walk(3);
		gf3.fly(new Location(10,3));
		System.out.println();
		
		
		StringBuilder sb4 = new StringBuilder();
		sb4.append("*********************************************\n");
		sb4.append("               BrownBear Tests               \n");
		sb4.append("*********************************************\n");
		System.out.println(sb4);
		
		BrownBear bb=new BrownBear();
		System.out.println(bb);
		
		BrownBear bb2=new BrownBear(1, new Location(2,7), "european");
		
		bb2.setSubSpecies("Panda");
		bb2.setSubSpecies("grizzly");
		System.out.println(bb2.getSubSpecies());
		
		System.out.println(bb2);
		
		bb2.walk(2);
		bb2.swim(-2);
		System.out.println();
		
		
		StringBuilder sb5 = new StringBuilder();
		sb5.append("*********************************************\n");
		sb5.append("               Generics Tests                \n");
		sb5.append("*********************************************\n");
		System.out.println(sb5);
		
		ArrayList<Animal> animalList=new ArrayList<Animal>();
		animalList.add(gf);
		animalList.add(gf3);
		animalList.add(bb);
		animalList.add(bb2);

		for (Animal a : animalList) System.out.println(a);

	}//end main

}//end class
