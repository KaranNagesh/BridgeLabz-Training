package fittrack;

class StrengthWorkout extends Workout {

    StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public int calculateCalories() {
        return duration * 5;  // moderate burn
    }

	
}
