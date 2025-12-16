import java.util.*;
class AreaOfCircle{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int radius = sc.nextInt();
	System.out.println(calculateArea(radius));
}
    public static double calculateArea(int radius){
	return 3.14 * radius * radius ;
}
}