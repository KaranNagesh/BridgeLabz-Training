package lambdaexpressionandmethodreference.smarthomelightingautomation;

public class Main {
	public static void main(String args[]) {
		LightPattern motionLight = () ->{
			System.out.println("Motion Detected : light is activated");	
			};
			
		LightPattern nightLight = () ->{
			System.out.println("Night occurs : night warm lights on");
		};
		
		LightPattern voiceLight = () ->{
			System.out.println("Voice detected : the ambient light is on now");
		};
		
		motionLight.activate();
		nightLight.activate();
		voiceLight.activate();
	}
}
