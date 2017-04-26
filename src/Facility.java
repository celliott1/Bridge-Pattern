
abstract class Facility {

	public String name;
	public String address;
	public String phoneNumber;
	public String groundFloor;
	public String secondFloor;
	public String thirdFloor;
	
	public abstract String getGroundFloor();
	public abstract void setGroundFloor(String groundFloor);
	public abstract String getSecondFloor();
	public abstract void setSecondFloor(String secondFloor);
	public abstract String getThirdFloor();
	public abstract void setThirdFloor(String thirdFloor);
	
	public void getDetails(){
		System.out.println("Printing facility details:");
		System.out.println("Facility - " + name);
		System.out.println("Address - " + address);
		System.out.println("Phone Number - " + phoneNumber);
	}
	
	public void getFloors(){
		System.out.println(name + "'s ground floor is the " + groundFloor);
		System.out.println(name + "'s second floor is the " + secondFloor);
		System.out.println(name + "'s third floor is the " + thirdFloor);
	}
	
	
	
}
