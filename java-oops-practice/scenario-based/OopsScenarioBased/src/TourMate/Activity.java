package TourMate;

public class Activity implements IBookable {
	
	private double cost = 0;

	public double getCost() {
		return cost;
	}

	
	

	@Override
	public void book() {
		cost = 700;
		System.out.println("Booking for activity done successfully");
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		cost = 0;
		System.out.println("Cancelling the activitu");
		
	}

}
