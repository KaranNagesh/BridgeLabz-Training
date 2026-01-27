package com.regexandjunit.regex;


import java.util.Scanner;

public class ValidateHexColorCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "^#[0-9A-Fa-f]{6}$";

        System.out.print("Enter hex color code: ");
        String hexColor = scanner.nextLine();

        if (hexColor.matches(pattern)) {
            System.out.println( hexColor + "\" → Valid");
        } else {
            System.out.println( hexColor + "\" → Invalid");
        }

        scanner.close();
    }
}