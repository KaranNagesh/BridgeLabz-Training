package cabbygo;

public abstract class Vehicle implements IRideService {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    private double fare;       
    private String location;   

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    protected abstract double getRate();   

    @Override
    public void bookRide(int distance) {
        double baseFare = 50;
        fare = baseFare + distance * getRate();
        System.out.println("Vehicle Number : " + vehicleNumber + "\nVehicle Capacity : " + capacity);
        System.out.println(type + " booked \nFare: Rs" + fare);
    }

    @Override
    public void endRide() {
        System.out.println(type + " ride ended.");
    }

    // Read-only access
    public double getFare() {
        return fare;
    }
    
    
}