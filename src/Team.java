import java.util.ArrayList;

public class Team<E extends Player> {

    private ArrayList<E> players = new ArrayList<>();
    private final String name;

    public Team(String name) {
        this.name = name;
    }

    public ArrayList<E> getPlayers() {
        return players;
    }
    public void addPlayer(E p) {
        this.players.add(p);
    }

    public void printPlayers() {
        this.players.forEach(Player::printInfo);
    }

    public String getName() {
        return this.name;
    }

    public String playAgainst(Team<E> o) {

        int ratingT1 = this.calcTeamRating();
        int ratingT2 = o.calcTeamRating();

        if(ratingT1 > ratingT2) {
            return "Home team wins!: " + this.name;
        } else if (ratingT1 < ratingT2){
            return "Away team wins!: " + o.getName();
        }
        return "Unentschieden zwischen: " + this.name + " : " + o.getName();
    }

    public int calcTeamRating() {

        int rating = 0;

        for (Player p : this.players) {
            rating += p.getRating();
        }

        return rating;
    }
}
