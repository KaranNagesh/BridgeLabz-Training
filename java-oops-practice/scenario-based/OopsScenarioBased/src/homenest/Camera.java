
package homenest;

//Camera device
class Camera extends Device {

	Camera(String deviceId) {
		super(deviceId, 1.2);
	}

	// Reset behavior for Camera
	public void reset() {
		System.out.println("Camera reset: reconnecting to network");
	}
}
