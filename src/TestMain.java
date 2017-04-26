
public class TestMain {
	
	public static void main(String[] args){
	
		Theatre sc1 = new FirstTheatre(new ShoppingCenter("The Water Tower", "488 N. Clybourn Ave, Chicago IL, 60660", "(773) 765-2541"));
		Theatre sc2 = new SecondTheatre(new ShoppingCenter("Stonestown", "288 Masonic Ave, San Francisco CA, 94121", "(415) 752-2890"));
		
		//setting the floors for shopping centers
		sc1.setGroundFloor("Food Court");
		sc1.setSecondFloor("Clothing Outlets");
		sc1.setThirdFloor("Theatre");
		sc2.setGroundFloor("Clothing Outlets");
		sc2.setSecondFloor("Theatre");
		sc2.setThirdFloor("Bowling Alley");
		
		//getting details/floors/showings for sc1
		sc1.getDetails();
		System.out.println();
		sc1.getFloors();
		System.out.println();
		sc1.showing1();
		System.out.println();
		sc1.showing2();
		System.out.println();
		sc1.showing3();
		System.out.println();
		
		//getting details/floors/showings for sc2
		sc2.getDetails();
		System.out.println();
		sc2.getFloors();
		System.out.println();
		sc2.showing1();
		System.out.println();
		sc2.showing2();
		System.out.println();
		sc2.showing3();
		System.out.println();
	
	}
}
