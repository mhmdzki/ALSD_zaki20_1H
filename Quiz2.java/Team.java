class Team {
    String name;
    int matchesPlayed;
    int wins3_0_3_1;
    int wins3_2;
    int losses2_3;
    int losses1_3_0_3;
    int points;
    int setsWon;
    int setsLost;
    int scores;
    Team next;

    public Team(String name) {
        this.name = name;
        this.matchesPlayed = 0;
        this.wins3_0_3_1 = 0;
        this.wins3_2 = 0;
        this.losses2_3 = 0;
        this.losses1_3_0_3 = 0;
        this.points = 0;
        this.setsWon = 0;
        this.setsLost = 0;
        this.scores = 0;
        this.next = null;
    }

    public double getSetRatio() {
        return setsLost == 0 ? setsWon : (double) setsWon / setsLost;
    }

    public String getSetRatioString() {
        return setsWon + "-" + setsLost;
    }

    public double getScoreRatio() {
        return setsLost == 0 ? scores : (double) scores / (setsWon + setsLost);
    }

    public String getScoreRatioString() {
        return scores + "-" + (setsWon * 25 + setsLost * 15);  // Contoh perhitungan skor
    }
}