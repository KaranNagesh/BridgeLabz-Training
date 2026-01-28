package com.reflectionandannotation.reflection.dicontainer;

public class UserService {

	@Inject
	private EmailService emailService; // Dependency

	public void processUser() {
		emailService.sendEmail("Welcome User!");
	}
}
