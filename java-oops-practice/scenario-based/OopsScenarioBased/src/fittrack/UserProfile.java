package fittrack;

public class UserProfile {
	private String name;
	private int age;
	private double weight;
	private int dailyGoal;
	
	
	//Default goal contructor
	UserProfile(String name,int age, double weight){
		this.name = name;
		this.setWeight(weight);
		this.age = age;
		this.dailyGoal = 500;
	}
	
	//Custom goal constructor
	UserProfile(String name, int age, double weight,int goal){
		this.name = name;
		this.age = age;
		this.setWeight(weight);
		this.dailyGoal = goal;
	}
	
	public int getDailyGoal() {
		return dailyGoal;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight >0) {
			this.weight = weight;
		}
	}
	
	public void displayProfile() {
		System.out.println("user : " + name + " , Age : " + age + " , weight: " + weight + "kg, Goal: " + dailyGoal + " calories");
	}
	
	
	
}
