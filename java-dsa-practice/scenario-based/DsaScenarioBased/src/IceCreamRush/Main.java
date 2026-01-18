package IceCreamRush;

public class Main {
	public static void main(String[] args) {
		Flavors f1 = new Flavors("Chocholate" , 540);
		Flavors f2 = new Flavors("Vanilla", 620);
		Flavors f3 = new Flavors("Strawberry", 480);
		Flavors f4 = new Flavors("Mango    ", 710);
		Flavors f5 = new Flavors("Butterscotch", 390);
		Flavors f6 = new Flavors("Black Currant", 450);
		Flavors f7 = new Flavors("Pista      ", 530);
		Flavors f8 = new Flavors("Coffee", 660);
		
		Flavors[] arr = {f1,f2,f3,f4,f5,f6,f7,f8};
		
		for(int i = 0 ; i < arr.length - 1; i++) {
			for(int j = i + 1 ; j < arr.length; j++) {
				if(arr[j].salesFigure > arr[i].salesFigure) {
					Flavors temp = arr[i] ;
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("Flavour : " + arr[i].flavorName + " \t\t\t Sales/Day : "+ arr[i].salesFigure);
		}
		
	}
}
