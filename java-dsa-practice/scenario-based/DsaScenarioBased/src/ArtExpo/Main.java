package ArtExpo;
import java.util.*;
import java.time.*;

public class Main {
	public static void main(String[] args) {
		
		
		ArtistList artistList  = new ArtistList();
		artistList.add("Karan",  LocalTime.of(10, 10));
		artistList.add("Neha",   LocalTime.of(13, 30));
		artistList.add("Aman",   LocalTime.of(11, 00));
		artistList.add("Rahul",  LocalTime.of(14, 00));
		artistList.add("Simran", LocalTime.of(12, 15));
		
		System.out.println();
		System.out.println("--------After Some Artist Arrives checking the real time sorting--------");
		artistList.showList();
		
		artistList.add("Rohit",  LocalTime.of(10, 45));
		artistList.add("Priya",  LocalTime.of(13, 00));
		artistList.add("Arjun",  LocalTime.of(11, 40));
		artistList.add("Meena",  LocalTime.of(12, 50));
		artistList.add("Vikas",  LocalTime.of(10, 30));

		
		System.out.println();
		System.out.println("--------After Every Artist Arrives--------");
		artistList.showList();
	}
}

