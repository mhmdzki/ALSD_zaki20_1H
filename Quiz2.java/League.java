class League {
    private Team head;

    public void addTeam(String name) {
        Team newTeam = new Team(name);
        if (head == null) {
            head = newTeam;
        } else {
            Team current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTeam;
        }
    }

    public void updateResult(String team1Name, String team2Name, int team1Score, int team2Score) {
        Team team1 = findTeam(team1Name);
        Team team2 = findTeam(team2Name);

        if (team1 != null && team2 != null) {
            team1.matchesPlayed++;
            team2.matchesPlayed++;

            team1.setsWon += team1Score;
            team1.setsLost += team2Score;
            team2.setsWon += team2Score;
            team2.setsLost += team1Score;

            team1.scores += team1Score;
            team2.scores += team2Score;

            if (team1Score > team2Score) {
                if (team1Score == 3 && team2Score < 2) {
                    team1.wins3_0_3_1++;
                    team1.points += 3;
                } else {
                    team1.wins3_2++;
                    team1.points += 2;
                    team2.losses2_3++;
                    team2.points += 1;
                }
                team2.losses1_3_0_3++;
            } else {
                if (team2Score == 3 && team1Score < 2) {
                    team2.wins3_0_3_1++;
                    team2.points += 3;
                    team1.losses1_3_0_3++;
                } else {
                    team2.wins3_2++;
                    team2.points += 2;
                    team1.losses2_3++;
                    team1.points += 1;
                }
            }
        }
    }

    private Team findTeam(String name) {
        Team current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void sortTeams() {
        if (head == null || head.next == null) {
            return;
        }

        head = mergeSort(head);
    }

    private Team mergeSort(Team head) {
        if (head == null || head.next == null) {
            return head;
        }

        Team middle = getMiddle(head);
        Team nextOfMiddle = middle.next;

        middle.next = null;

        Team left = mergeSort(head);
        Team right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    private Team sortedMerge(Team left, Team right) {
        Team result;
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.points > right.points || 
            (left.points == right.points && left.getSetRatio() > right.getSetRatio()) || 
            (left.points == right.points && left.getSetRatio() == right.getSetRatio() && left.getScoreRatio() > right.getScoreRatio())) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }

    private Team getMiddle(Team head) {
        if (head == null) {
            return head;
        }

        Team slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void printStandings() {
        System.out.println("Hasil Klasemen Proliga Voli Indonesia Tahun 2022:");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Pos |             Tim               | Main | M 3-0/3-1 | M 3-2 | K 2-3 | K 1-3/ 0-3 | Poin | Rasio Set | Rasio Skor |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        Team current = head;
        int rank = 1;
        while (current != null) {
            System.out.printf("| %-3d | %-29s | %-4d | %-9d | %-5d | %-5d | %-10d | %-4d | %-9s | %-10s |\n",
                    rank, current.name, current.matchesPlayed, current.wins3_0_3_1, current.wins3_2,
                    current.losses2_3, current.losses1_3_0_3, current.points,
                    current.getSetRatioString(), current.getScoreRatioString());
            current = current.next;
            rank++;
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        }
    }
    

    public void printBestPlayers() {
        System.out.println("\nPemain Terbaik:");
        System.out.println("Server Terbaik: Farhan Halim, Jakarta Pertamina Pertamax");
        System.out.println("Libero Terbaik: Irpan, Bogor Lavani");
        System.out.println("Setter Terbaik: Nizar Zulfikar, Surabaya Bhayangkara Samator");
        System.out.println("Spiker Terbaik: Jorge Gonzales Garcia, Bogor Lavani");
        System.out.println("Bloker Terbaik: Osmany Camejo Durruthy, Jakarta BNI 46");
        System.out.println("Top Scorer: Leandro Martins da Silva, Bogor Lavani");
        System.out.println("MVP/Pemain Terbaik: Doni Haryono, Bogor Lavani");
    }
}
