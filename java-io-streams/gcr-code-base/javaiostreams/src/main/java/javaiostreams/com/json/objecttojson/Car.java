package javaiostreams.com.json.objecttojson;

//Car class
public class Car {
	private String brand;
	private String model;
	private int year;

	// parameterized constructor
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	// getters and setters
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
}
