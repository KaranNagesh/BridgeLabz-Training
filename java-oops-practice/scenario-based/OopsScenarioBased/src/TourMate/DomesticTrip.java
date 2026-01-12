package TourMate;

public class DomesticTrip extends Trip {
	protected String govtID;

	DomesticTrip(String destination, int durationInDays,String govtID) {
		super(destination, durationInDays);
		this.govtID = govtID;
		// TODO Auto-generated constructor stub
	}

	
}
