
public class FirstTheatre extends Theatre{

	public FirstTheatre(Facility newFacility) {
		super(newFacility);
	}

	@Override
	public void showing1() {
		System.out.println("The first showing at the theatre is X-Men");
		
	}

	@Override
	public void showing2() {
		System.out.println("The second showing at the theatre is Superman");
		
	}

	@Override
	public void showing3() {
		System.out.println("The third showing at the theatre is Batman");
		
	}

}
