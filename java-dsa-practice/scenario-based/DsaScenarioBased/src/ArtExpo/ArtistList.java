package ArtExpo;
import java.time.*;
import java.util.ArrayList;

public class ArtistList {
	public static ArrayList<ArtistList> artists = new ArrayList<>();
	
	String name;
	LocalTime regTime;
	
	ArtistList(){
		
	}
	
	ArtistList(String name, LocalTime regTime){
		this.name = name;
		this.regTime = regTime;
		
	}
	
	void add(String name, LocalTime regTime) {
		ArtistList artist = new ArtistList(name,regTime);
		artists.add(artist);
		sort(artists);
	}
	
	void sort(ArrayList<ArtistList> arr) {
		ArtistList key = arr.get(arr.size() - 1);

		int j = arr.size() - 2;
		
		while(j >= 0 && arr.get(j).regTime.isAfter(key.regTime)) {
			arr.set(j+1, arr.get(j));
			j--;
		}
		arr.set(j+1, key);
	}
	
	void showList() {
		for(ArtistList arr : artists) {
			System.out.println(arr.name + " arrive on " + arr.regTime.toString());
		}
	}
	
}
