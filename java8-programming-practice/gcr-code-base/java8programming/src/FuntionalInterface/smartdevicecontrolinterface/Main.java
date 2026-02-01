package FuntionalInterface.smartdevicecontrolinterface;

public class Main {
	public static void main(String[] args) {
		Lights light1 = new Lights();
		light1.turnOn();
		light1.turnOff();
		
		TV tv1 = new TV();
		tv1.turnOff();
		tv1.turnOn();
	}
}
