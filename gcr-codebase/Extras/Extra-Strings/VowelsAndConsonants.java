import java.util.Scanner;
public class VowelsAndConsonants {
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String : ");
	String str = sc.nextLine();
	
	//Variabl counter for vowels
	int vowel = 0;
	
	//Variable counter for consonants;
	int consonant = 0 ;
	
	//Iterating throughout the string and checking for vowels and consonants
	for(int i = 0 ; i < str.length();i++){
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'e'|| str.charAt(i) == 'u'
		   || str.charAt(i) == 'e'|| str.charAt(i) == 'E'|| str.charAt(i) == 'I'|| str.charAt(i) == 'O'|| str.charAt(i) == 'U'
		 ){
			 vowel++;
		 } else {
			 consonant++;
		 }
	}
	
	//Displaying results
	System.out.println("Numbers of vowels : " + vowel);
	System.out.println("Number of consonants : " + consonant);
	}
}