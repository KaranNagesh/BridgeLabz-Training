import java.util.*;
class PerimeterOfARectangle{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int length = sc.nextInt();
	int width = sc.nextInt();
	System.out.println(perimeter(length,width));
}
    public static int perimeter(int length, int width){
	return 2 * (length + width);
}
}