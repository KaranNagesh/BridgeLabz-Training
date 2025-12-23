import java.util.Scanner;

public class RockPaperScissors {

    // Constants for choices
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";

    // Method to generate computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0) return ROCK;
        else if (choice == 1) return PAPER;
        else return SCISSORS;
    }

    // Method to find winner of a game
    // Returns: "User", "Computer", or "Draw"
    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals(ROCK) && computer.equals(SCISSORS)) ||
            (user.equals(PAPER) && computer.equals(ROCK)) ||
            (user.equals(SCISSORS) && computer.equals(PAPER))) {
            return "User";
        }

        return "Computer";
    }

    // Method to calculate win statistics
    // Returns a 2D String array
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        userPercentage = Math.round(userPercentage * 100.0) / 100.0;
        computerPercentage = Math.round(computerPercentage * 100.0) / 100.0;

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = userPercentage + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = computerPercentage + "%";

        return stats;
    }

    // Method to display game results and statistics
    public static void displayResults(
            String[][] games, String[][] stats) {

        System.out.println("\nGame\tUser\tComputer\tWinner");

        for (int i = 0; i < games.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                games[i][0] + "\t" +
                games[i][1] + "\t\t" +
                games[i][2]
            );
        }

        System.out.println("\nPlayer\tWins\tWin Percentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2]
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int gamesCount = sc.nextInt();

        String[][] gameResults = new String[gamesCount][3];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < gamesCount; i++) {

            System.out.print(
                "Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(
            userWins, computerWins, gamesCount);

        displayResults(gameResults, stats);

        sc.close();
    }
}
