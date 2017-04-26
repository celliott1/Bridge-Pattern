
public class SecondTheatre extends Theatre{

	public SecondTheatre(Facility newFacility) {
		super(newFacility);
	}

	@Override
	public void showing1() {
		System.out.println("The first showing at the theatre is Wonderwoman");
		
	}

	@Override
	public void showing2() {
		System.out.println("The second showing at the theatre is Spiderman");
		
	}

	@Override
	public void showing3() {
		System.out.println("The third showing at the theatre is Aquaman");
		
	}

}
