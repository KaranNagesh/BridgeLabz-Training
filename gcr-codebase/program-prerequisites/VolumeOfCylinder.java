import java.util.*;
class VolumeOfCylinder{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int radius = sc.nextInt();
	int height = sc.nextInt();
	System.out.println(Volumeof(radius , height));
}
    public static double Volumeof(int radius, int height){
	return 3.14 *  radius * radius * height;
}
}