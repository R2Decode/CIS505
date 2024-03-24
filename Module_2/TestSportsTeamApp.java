import java.util.Scanner;

public class TestSportsTeamApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter team name: ");
            String teamName = scanner.nextLine();

            Team team = new Team(teamName);

            System.out.print("Enter player names separated by commas (e.g., John,Doe): ");
            String playerNames = scanner.nextLine();
            String[] players = playerNames.split(",");

            for (String player : players) {
                team.addPlayer(player);
            }

            System.out.println("Number of players in team " + team.getTeamName() + ": " + team.getPlayerCount());
            System.out.print("Players on team: ");
            for (String player : team.getPlayers()) {
                if (player != null) {
                    System.out.print(player + " ");
                }
            }
            System.out.println();

            System.out.print("Do you want to continue? (yes/no): ");
            choice = scanner.nextLine();
        }
        scanner.close();
    }
}
