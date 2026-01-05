package cabbygo;

public class Sedan extends Vehicle {
	public Sedan(String vehicleNumber) {
		super(vehicleNumber,4,"Sedan");
	}
	
	@Override
	protected double getRate() {
		return 15;
	}
}
