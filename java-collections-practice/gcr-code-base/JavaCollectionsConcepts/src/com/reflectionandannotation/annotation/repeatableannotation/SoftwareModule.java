package com.reflectionandannotation.annotation.repeatableannotation;


public class SoftwareModule {

	@BugReport(description = "NullPointerException on startup")
	@BugReport(description = "Memory leak in processing logic")
	public void execute() {
		System.out.println("Executing module...");
	}
}