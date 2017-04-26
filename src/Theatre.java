
public abstract class Theatre {

	private Facility facility;
	
	public Theatre(Facility newFacility){
		facility = newFacility;
	}
	
	public void getGroundFloor() {
		facility.getGroundFloor();
	}

	public void setGroundFloor(String groundFloor) {
		facility.setGroundFloor(groundFloor);
		
	}

	public void getSecondFloor() {
		facility.getSecondFloor();
	}

	public void setSecondFloor(String secondFloor) {
		facility.setSecondFloor(secondFloor);
		
	}

	public void getThirdFloor() {
		facility.getThirdFloor();
	}

	public void setThirdFloor(String thirdFloor) {
		facility.setThirdFloor(thirdFloor);
	}
	public void getDetails(){
		facility.getDetails();
	}
	
	public void getFloors(){
		facility.getFloors();
	}
	
	public abstract void showing1();
	public abstract void showing2();
	public abstract void showing3();
	
	
}
