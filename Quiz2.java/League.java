import java.util.*;

public class League {
    // Team head;
    List<Team> teams;
    Map<String, Team> teamMap;
    Map<String, Player> awardMap;

    League() {
        teams = new ArrayList<>();
        teamMap = new HashMap<>();
        awardMap = new HashMap<>();
        initTeams();
        initAwards();
    }

    void initTeams() {
        Team bogorLavani = new Team("Bogor LaVani");
        bogorLavani.addPlayer(new Player("Leandro Martins da Silva", "Spiker", 0));
        bogorLavani.addPlayer(new Player("Irpan", "Libero", 0));
        bogorLavani.addPlayer(new Player("Doni Haryono", "Pemain", 0));
        bogorLavani.addPlayer(new Player("Jorge Gonzales Garcia", "Spiker", 0));
        teams.add(bogorLavani);
        teamMap.put("Bogor LaVani", bogorLavani);

        Team jakartaBNI46 = new Team("Jakarta BNI 46");
        jakartaBNI46.addPlayer(new Player("Osmany Camejo Durruthy", "Bloker", 0));
        teams.add(jakartaBNI46);
        teamMap.put("Jakarta BNI 46", jakartaBNI46);

        Team jakartaPertaminaPertamax = new Team("Jakarta Pertamina Pertamax");
        jakartaPertaminaPertamax.addPlayer(new Player("Farhan Halim", "Server", 0));
        teams.add(jakartaPertaminaPertamax);
        teamMap.put("Jakarta Pertamina Pertamax", jakartaPertaminaPertamax);

        Team kudusSukunBadak = new Team("Kudus Sukun Badak");
        teams.add(kudusSukunBadak);
        teamMap.put("Kudus Sukun Badak", kudusSukunBadak);

        Team palembangBankSumselBabel = new Team("Palembang Bank Sumsel Babel");
        teams.add(palembangBankSumselBabel);
        teamMap.put("Palembang Bank Sumsel Babel", palembangBankSumselBabel);

        Team surabayaBhayangkaraSamator = new Team("Surabaya Bhayangkara Samator");
        surabayaBhayangkaraSamator.addPlayer(new Player("Nizar Zulfikar", "Setter", 0));
        teams.add(surabayaBhayangkaraSamator);
        teamMap.put("Surabaya Bhayangkara Samator", surabayaBhayangkaraSamator);
    }

    void initAwards() {
        awardMap.put("Server Terbaik", null);
        awardMap.put("Libero Terbaik", null);
        awardMap.put("Setter Terbaik", null);
        awardMap.put("Spiker Terbaik", null);
        awardMap.put("Bloker Terbaik", null);
        awardMap.put("Top Scorer", null);
        awardMap.put("MVP/Pemain Terbaik", null);
    }

    void updateResult(String team1Name, String team2Name, int team1Score, int team2Score) {
        Team team1 = teamMap.get(team1Name);
        Team team2 = teamMap.get(team2Name);

        if (team1 != null && team2 != null) {
            team1.matchesPlayed++;
            team2.matchesPlayed++;

            if (team1Score > team2Score) {
                team1.wins++;
                team1.points += 3;
                team2.losses++;
            } else if (team1Score < team2Score) {
                team2.wins++;
                team2.points += 3;
                team1.losses++;
            } else {
                team1.points++;
                team2.points++;
                team1.draws++;
                team2.draws++;
            }
        }
    }

    void displayStandings() {
        Collections.sort(teams, new Comparator<Team>() {
            @Override
            public int compare(Team team1, Team team2) {
                return team2.points - team1.points;
            }
        });

        System.out.println("\n******************************* KLASEMEN PRO LIGA VOLI *********************************");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %-4s | %-18s | %-6s | %-6s | %-6s | %-6s | %-6s |\n", "Rank", "\t\tTim", "Game", "Menang", "Seri", "Kalah", "Poin");
        System.out.println("----------------------------------------------------------------------------------------");

        int rank = 1;
        for (Team team : teams) {
            System.out.printf("| %-4d | %-31s | %-6d | %-6d | %-6d | %-6d | %-6d |\n", rank, team.name, team.matchesPlayed, team.wins, team.draws, team.losses, team.points);
            rank++;
        }

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Jumlah Tim: " + teams.size() + "\n");
    }

    void setAwards() {
        for (Team team : teams) {
            for (Player player : team.players) {
                Player awardPlayer = awardMap.get(player.role + " Terbaik");
                if (awardPlayer == null || player.points > awardPlayer.points) {
                    awardMap.put(player.role + " Terbaik", player);
                }
            }
        }

        Player topScorer = null;
        for (Team team : teams) {
            for (Player player : team.players) {
                if (topScorer == null || player.points > topScorer.points) {
                    topScorer = player;
                }
            }
        }
        awardMap.put("Top Scorer", topScorer);

        awardMap.put("MVP/Pemain Terbaik", awardMap.get("Pemain Terbaik"));
    }

    void displayAwards() {
        System.out.println("Pemenang Putra:");
        for (Map.Entry<String, Player> entry : awardMap.entrySet()) {
            if (entry.getValue() != null) {
                System.out.println(entry.getKey() + ": " + entry.getValue().name);
            }
        }
    }

    // public void addTeam(String name) {
    //     Team newTeam = new Team(name);

    //     if (head == null) {
    //         head = newTeam;
    //     } else {
    //         Team current = head;
    //         while (current.next != null) {
    //             current = current.next;
    //         }
    //         current.next = newTeam;
    //     }
    // }

    // public void updateResult(String team1Name, String team2Name, int team1Score, int team2Score) {
    //     Team team1 = findTeam(team1Name);
    //     Team team2 = findTeam(team2Name);

    //     if (team1 != null && team2 != null) {
    //         team1.matchesPlayed++;
    //         team2.matchesPlayed++;

    //         if (team1Score > team2Score) {
    //             team1.wins++;
    //             team1.points += 3;
    //             team2.losses++;
    //         } else if (team1Score < team2Score) {
    //             team2.wins++;
    //             team2.points += 3;
    //             team1.losses++;
    //         } else {
    //             team1.points++;
    //             team2.points++;
    //         }
    //     }
    // }

    // public Team findTeam(String name) {
    //     Team current = head;
    //     while (current != null) {
    //         if (current.name.equals(name)) {
    //             return current;
    //         }
    //         current = current.next;
    //     }
    //     return null;
    // }

    // public void displayStandings() {
    //     List<Team> teams = new ArrayList<>();
    //     Team current = head;
    //     while (current != null) {
    //         teams.add(current);
    //         current = current.next;
    //     }

    //     // Mengurutkan tim berdasarkan poin (descending)
    //     Collections.sort(teams, new Comparator<Team>() {
    //         @Override
    //         public int compare(Team team1, Team team2) {
    //             return team2.points - team1.points;
    //         }
    //     });

    //     System.out.println("\n********************************* KLASEMEN IBL ********************************");
    //     System.out.println("-----------------------------------------------------------------------------");
    //     System.out.printf("| %-4s | %-17s | %-6s | %-6s | %-6s | %-6s |\n", "Rank", "\t\tTim", "Game", "Menang", "Kalah", "Poin");
    //     System.out.println("-----------------------------------------------------------------------------");

    //     int rank = 1;
    //     for (Team team : teams) {
    //         System.out.printf("| %-4d | %-30s | %-6d | %-6d | %-6d | %-6d |\n", rank, team.name, team.matchesPlayed, team.wins, team.losses, team.points);
    //         rank++;
    //     }

    //     System.out.println("-----------------------------------------------------------------------------");
    //     System.out.println("Jumlah Tim: " + teams.size() + "\n");
    // }
}