package TourMate;

public class Transport implements IBookable {
	
	private double cost ;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public void book() {
		// TODO Auto-generated method stub
		cost = 2000;
		System.out.println("Booked transport successfully");
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		this.cost = 0;
		System.out.println("Cancelled sucessfully");
		
	}

}
