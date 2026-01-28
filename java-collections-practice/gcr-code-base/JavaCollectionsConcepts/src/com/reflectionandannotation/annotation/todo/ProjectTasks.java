package com.reflectionandannotation.annotation.todo;

public class ProjectTasks {

	@Todo(task = "Implement user authentication", assignedTo = "Arif", priority = "HIGH")
	public void authFeature() {
		// pending implementation
	}

	@Todo(task = "Add email notification service", assignedTo = "Ritika")
	public void emailFeature() {
		// pending implementation
	}

	@Todo(task = "Optimize database queries", assignedTo = "Rahul", priority = "LOW")
	public void dbOptimization() {
		// pending implementation
	}
}
