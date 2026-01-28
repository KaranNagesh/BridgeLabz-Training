package com.reflectionandannotation.annotation.customannotation;

public class TaskManager {

	@TaskInfo(priority = 1, assignedTo = "Arif")
	public void processTask() {
		System.out.println("Processing task...");
	}
}
