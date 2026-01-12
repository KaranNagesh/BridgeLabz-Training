package fittrack;

class CardioWorkout extends Workout {

    CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public int calculateCalories() {
        return duration * 8;  // higher burn
    }
}
