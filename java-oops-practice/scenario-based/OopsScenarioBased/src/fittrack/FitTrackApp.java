package fittrack;

class FitTrackApp {

    public static void showProgress(UserProfile user, Workout workout) {
        int remainingCalories = user.getDailyGoal() - workout.getCaloriesBurned();

        System.out.println("Calories Burned: " +
                workout.getCaloriesBurned());

        System.out.println("Remaining Calories to Goal: " +
                remainingCalories);
    }
}
