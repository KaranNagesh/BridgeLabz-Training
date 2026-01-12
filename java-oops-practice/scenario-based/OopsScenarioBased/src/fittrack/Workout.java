package fittrack;

abstract class Workout implements ITrackable {
	protected String type;
	protected int duration;
	protected int caloriesBurned;
	
	protected boolean isActive;
	
	Workout(String type,int duration){
		this.type = type;
		this.duration = duration;
		this.caloriesBurned = 0;
		this.isActive = false;
	}
	
	public abstract int calculateCalories();
	
	@Override
	public void startWorkout() {
		isActive = true;
		System.out.println(type + " workout started.");
	}

	@Override
	public void stopWorkout() {
		isActive = false;
		caloriesBurned = calculateCalories();
		System.out.println(type + " workout stopped.");
	}

	

	public int getCaloriesBurned() {
		// TODO Auto-generated method stub
		return caloriesBurned;
	}
}
