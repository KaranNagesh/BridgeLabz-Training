package TourMate;

public class Test {
	public static void main(String[] args) {
		Trip t1 = new DomesticTrip("Manali",3,"IN205462");
		t1.hotel.book();
		t1.activity.book();
		t1.transport.book();
		
		t1.setBudget(6500);
		
		t1.totalTripCost();
		
		Trip t2 = new InternationalTrip("France" , 6,"VISA3655");
		
		t2.activity.book();
		t2.transport.book();
		
		t2.cancel();
		
	}
}
