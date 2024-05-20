class Team {
    String nama;
    int matchesPlayed;
    int wins;
    int losses;
    int points;
    Team next;

    public Team(String nama) {
        this.nama = nama;
        this.matchesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
        this.points = 0;
        this.next = null;
    }
}