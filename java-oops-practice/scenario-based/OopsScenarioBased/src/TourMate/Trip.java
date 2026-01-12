package TourMate;

public class Trip implements IBookable{
	protected String destination;
	private double budget;
	protected int  durationInDays;
	
	Trip(String destination, int durationInDays){
		this.destination = destination;
		this.setBudget(budget);
		this.durationInDays = durationInDays;
	}
	
	Hotel hotel = new Hotel(durationInDays);
	Activity activity = new Activity();
	Transport transport = new Transport();
	
	
	void totalTripCost() {
		double total = hotel.getCost() + activity.getCost() + transport.getCost();
		System.out.println("Your total trip cost is rs." + total);
		if(total > budget) {
			System.out.println("Your budget is less than the total cost for this trip you have to increase your budget !!");
		} else {
			System.out.println("hurrayy !! Your budget matches the trip cost , PACK YOUR BAGS and get ready !!");
		}
		
	}


	public double getBudget() {
		return budget;
	}


	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	@Override
	public void book() {
		// TODO Auto-generated method stub
		totalTripCost();
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("Cancelling your international trip !");
	}
	
}
