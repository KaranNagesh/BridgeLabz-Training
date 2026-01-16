
package homenest;
//Light device
class Light extends Device {

 Light(String deviceId) {
     super(deviceId, 0.5);
 }

 // Reset behavior for Light
 public void reset() {
     System.out.println("Light reset: brightness set to default");
 }
}
