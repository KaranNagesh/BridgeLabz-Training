package com.reflectionandannotation.annotation.importantmethod;

public class ServiceManager {

	@ImportantMethod
	public void startService() {
		System.out.println("Service started");
	}

	@ImportantMethod(level = "MEDIUM")
	public void restartService() {
		System.out.println("Service restarted");
	}

	public void stopService() {
		System.out.println("Service stopped");
	}
}
