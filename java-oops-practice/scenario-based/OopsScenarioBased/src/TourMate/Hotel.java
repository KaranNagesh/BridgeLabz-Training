package TourMate;

public class Hotel implements IBookable {
	int days;
	Hotel(int days){
		this.days = days;
	}
	private double cost ;


	public double getCost() {
		return cost;
	}
	
	public void setCost() {
		
		this.cost =  2400;
	
	}
	
	

	@Override
	public void book() {
		this.cost = 2400;
		
		this.setCost();
		
		// TODO Auto-generated method stub
		System.out.println("You booked hotel successfully !!");
		
	}

	@Override
	public void cancel() {
		this.cost = 0;
		// TODO Auto-generated method stub
		System.out.println("Cancelled the booking of hotel");
	}

}
