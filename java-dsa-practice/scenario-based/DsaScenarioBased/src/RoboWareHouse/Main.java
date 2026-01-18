package RoboWareHouse;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Packages p1 = new Packages(1,  120);
		Packages p2 = new Packages(1,  240);
		Packages p3 = new Packages(1,  160);
		Packages p4 = new Packages(1,  420);
		Packages p5 = new Packages(1,  650);
		Packages p6 = new Packages(1,  850);
		Packages p7 = new Packages(1,  230);
		Packages p8 = new Packages(1,  720);
		Packages p9 = new Packages(1,  320);
		
		ArrayList<Packages> arr = new ArrayList<>();
		
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		arr.add(p5);
		arr.add(p6);
		arr.add(p7);
		arr.add(p8);
		arr.add(p9);
		
		int n = arr.size();
		
		for (int i = 1; i < arr.size(); i++) {
		    Packages key = arr.get(i);
		    int j = i - 1;

		    while (j >= 0 && arr.get(j).wieght > key.wieght) {
		        arr.set(j + 1, arr.get(j));
		        j--;
		    }
		    arr.set(j + 1, key); 
		}

		
		for (int i = 0; i < arr.size(); i++) {
		    System.out.println(arr.get(i).wieght);
		}
	}
	

}