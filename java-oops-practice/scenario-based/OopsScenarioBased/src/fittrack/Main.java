package fittrack;

public class Main {
    public static void main(String[] args) {

        UserProfile user =
                new UserProfile("Karan", 21, 92.5, 600);

        user.displayProfile();

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(40);

        cardio.startWorkout();
        cardio.stopWorkout();
        FitTrackApp.showProgress(user, cardio);

        System.out.println();

        strength.startWorkout();
        strength.stopWorkout();
        FitTrackApp.showProgress(user, strength);
    }
}
