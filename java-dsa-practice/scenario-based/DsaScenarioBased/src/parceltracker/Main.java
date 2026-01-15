package parceltracker;

public class Main {
	public static void main(String[] args) {
		Tracker parcel = new Tracker();
		parcel.addStage("Packed");
		parcel.addStage("Shipped");
		parcel.addStage("In Transit");
		parcel.addStage("Delivered");
		parcel.addCheckPoint("Shipped", "WareHouse");
	    parcel.trackParcel();
	}
}
