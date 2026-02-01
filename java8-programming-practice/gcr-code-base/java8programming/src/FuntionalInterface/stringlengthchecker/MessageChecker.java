package FuntionalInterface.stringlengthchecker;

import java.util.function.Function;

public class MessageChecker {
	public static void main(String[] args) {
		int limit = 15;
		
		Function<String,Integer> lenghtcal = msg -> msg.length();
		
		String message = "Hello I am learning java 8 functional interfaces ";
		
		int length = lenghtcal.apply(message);
		
		if(length > limit) {
			System.out.println("Your message is too long");
		} else {
			System.out.println("A valid message");
		}
		
	}
}
