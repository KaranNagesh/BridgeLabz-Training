package com.reflectionandannotation.reflection.dicontainer;

public class DITest {

	public static void main(String[] args) {

		// Get UserService with dependencies injected
		UserService service = SimpleDIContainer.getBean(UserService.class);

		service.processUser();
	}
}
