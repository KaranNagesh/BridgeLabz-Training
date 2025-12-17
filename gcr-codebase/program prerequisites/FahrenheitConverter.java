import java.util.*;
class FarhenheitConerter{
    public static double converter(double celsius){
	return (celsius * 9/5) + 32;
    
}
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      double celsius = sc.nextInt();
      System.out.println(converter(celsius));
}
}