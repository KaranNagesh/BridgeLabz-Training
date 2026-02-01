package FuntionalInterface.passwordstrengthvalidator;

public interface SecurityUtils {
	static boolean isStrongPassword(String password) {
		if(password.length() < 8) {
			return false;
		}
		
		boolean hasupper = false;
		boolean haslower = false;
		boolean hasDigit = false;
		boolean hasSpecail = false;
		
		for(char ch : password.toCharArray()) {
			if(Character.isUpperCase(ch)) hasupper = true;
			else if(Character.isLowerCase(ch)) haslower = true;
			else if(Character.isDigit(ch)) hasDigit = true;
			else hasSpecail = true;
		}
		
		return hasupper && haslower && hasDigit && hasSpecail;
	}
}
