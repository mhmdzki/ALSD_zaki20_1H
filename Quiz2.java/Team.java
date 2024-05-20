import java.util.ArrayList;
import java.util.List;

public class Team {

    Team next;
    String name;
    int matchesPlayed;
    int wins;
    int draws;
    int losses;
    int points;
    List<Player> players;

    public Team(String name) {
        this.name = name;
        this.matchesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
        this.points = 0;
        this.next = null;
        this.players = new ArrayList<>();
    }

    void addPlayer(Player player) {
        players.add(player);
    }
}