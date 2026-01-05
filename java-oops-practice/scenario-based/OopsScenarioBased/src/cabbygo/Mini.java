package cabbygo;

public class Mini extends Vehicle{
	
	public Mini(String vehicleNumber) {
		super(vehicleNumber,4,"Mini");	
	}
	
	@Override
	protected double getRate() {
		return 10;
	}
}
