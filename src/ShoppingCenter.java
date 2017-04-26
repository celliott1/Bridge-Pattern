
public class ShoppingCenter extends Facility {

	public ShoppingCenter(String newName, String newAddress, String newPhoneNumber){
		name = newName;
		address = newAddress;
		phoneNumber = newPhoneNumber;
	}

	@Override
	public String getGroundFloor() {
		return groundFloor;
	}

	@Override
	public void setGroundFloor(String groundFloor) {
		this.groundFloor = groundFloor;
		
	}

	@Override
	public String getSecondFloor() {
		return secondFloor;
	}

	@Override
	public void setSecondFloor(String secondFloor) {
		this.secondFloor = secondFloor;
		
	}

	@Override
	public String getThirdFloor() {
		return thirdFloor;
	}

	@Override
	public void setThirdFloor(String thirdFloor) {
		this.thirdFloor = thirdFloor;
	}

	


}
