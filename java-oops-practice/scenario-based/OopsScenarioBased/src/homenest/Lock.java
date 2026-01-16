
package homenest;

//Smart Lock device
class Lock extends Device {

	Lock(String deviceId) {
		super(deviceId, 0.3);
	}

	// Reset behavior for Lock
	public void reset() {
		System.out.println("Lock reset: security keys refreshed");
	}
}
