package com.reflectionandannotation.annotation.serialization;

public class User {

	@JsonField(name = "user_name")
	private String username;

	@JsonField(name = "user_age")
	private int age;

	private String password; // ❌ Not serialized (no annotation)

	public User(String username, int age, String password) {
		this.username = username;
		this.age = age;
		this.password = password;
	}
}
