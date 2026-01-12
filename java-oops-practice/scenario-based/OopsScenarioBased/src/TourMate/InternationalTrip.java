package TourMate;

public class InternationalTrip extends Trip {

	protected String visaID ;
	InternationalTrip(String destination, int durationInDays,String visaID) {
		
		super(destination, durationInDays);
		this.visaID = visaID;
		// TODO Auto-generated constructor stub
	}


	
}
