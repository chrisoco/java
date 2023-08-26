import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        new Main().top();

    }

    private void top() {

        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Java Basics >.<");

        printBaseColor("1x Football player:");
        FootballPlayer p1 = new FootballPlayer("John", 33);
        p1.sayHello();

        printBaseColor("1x Baseball player:");
        BaseballPlayer p2 = new BaseballPlayer("Albert", 67);
        p2.sayHello();

        printBaseColor("List of Football players:");
        ArrayList<FootballPlayer> footballers = new ArrayList<>();
        footballers.add(new FootballPlayer("Alex", 89));
        footballers.add(new FootballPlayer("Brian", 13));
        footballers.add(new FootballPlayer("Johan", 36));

        for (FootballPlayer player : footballers) {
            player.sayHello();
        }

        printBaseColor("Mixed List of all Players:");
        ArrayList<Player> players = new ArrayList<>();
        players.add(new FootballPlayer("Klaus", 100));
        players.add(new BaseballPlayer("Hans", 11));
        players.add(new FootballPlayer("Jürgen", 76));

        for (Player player : players) {
            player.sayHello();
        }


        printBaseColor("Sort Players based on rating (Comparable Interface):");
        Collections.sort(players);

        printBaseColor("Print all Player Names + Score with Lambda:");
        players.forEach(Player::printInfo);
        // Gleiche wie:
        // players.forEach(player -> {
        //     player.printInfo();
        // });

    }

    private void printBaseColor(String text) {
        System.out.println(ConsoleColor.BLACK.getCode() + text);
    }

}