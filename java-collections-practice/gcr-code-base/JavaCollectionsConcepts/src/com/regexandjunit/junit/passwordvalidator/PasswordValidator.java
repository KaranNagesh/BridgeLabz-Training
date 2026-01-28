package com.regexandjunit.junit.passwordvalidator;

public class PasswordValidator {

    // Validates password strength rules
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        // Checks minimum length
        if (password.length() < 8) {
            return false;
        }

        // Flags for validation rules
        boolean hasUppercase = false;
        boolean hasDigit = false;

        // Checks each character in password
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasDigit;
    }
}
