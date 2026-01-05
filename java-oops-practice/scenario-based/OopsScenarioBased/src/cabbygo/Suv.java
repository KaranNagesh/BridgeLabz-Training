package cabbygo;

public class Suv extends Vehicle{
	public Suv(String vehicleNumber) {
		super(vehicleNumber,6,"SUV");
	}
	
	@Override
	protected double getRate() {
		return 20;
	}
}
