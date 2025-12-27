package com.constructorsandinstances.level1;

public class HotelBooking {
	//attributes
	String guestName;
	String roomType;
	int nights;
	
	//Default constructor
	HotelBooking(){
		guestName = "Ansh";
		roomType = "Luxurious";
		nights = 4;
	}
	
	//Parameterized constructor
	HotelBooking(String gName , String rType, int n){
		this.guestName = gName;
		this.roomType = rType;
		this.nights = n;
	}
	
	//Copy constructor
	HotelBooking(HotelBooking hotelBooking){
		this.guestName = hotelBooking.guestName;
		this.roomType = hotelBooking.roomType;
		this.nights = hotelBooking.nights;
	}
	
	void display() {
		System.out.println("Guest Name : " + guestName);
		System.out.println("Roomtype is : " + roomType);
		System.out.println("Nights staying : " + nights);

	}
	
	public static void main(String[] args) {
		HotelBooking hotelBooking1 = new HotelBooking();
		hotelBooking1.guestName = "Pranjal";
		hotelBooking1.nights = 4;
		hotelBooking1.roomType = "AC";
		
		hotelBooking1.display();
	}
}
