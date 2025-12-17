public class VolumeOfEarth{
    public static void main(String[] args){
	double radiusInKilometers = 6378;
	double pi = 3.14;
	double radiusInMiles = radiusInKilometers * 0.6;
	double volumeInMiles =  pi*(radiusInMiles*radiusInMiles*radiusInMiles) * 4/3;
	double volumeInKilometers = pi*(radiusInKilometers*radiusInKilometers*radiusInKilometers)*4/3;
	System.out.println("The volume of earth in cubic kilometers is " + volumeInKilometers + " and cubic miles is " + volumeInMiles);
}
}