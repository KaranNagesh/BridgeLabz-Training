package com.reflectionandannotation.annotation.logging;

public class PerformanceService {

	@LogExecutionTime
	public void fastOperation() {
		for (int i = 0; i < 1_000_000; i++)
			;
	}

	@LogExecutionTime
	public void slowOperation() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void normalOperation() {
		System.out.println("Normal operation (not logged)");
	}
}
