class League {
    private Team head;

    public void addTeam(String nama) {
        Team newTeam = new Team(nama);
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
            }
        }
    }

    private Team findTeam(String nama) {
        Team current = head;
        while (current != null) {
            if (current.nama.equals(nama)) {
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

        if (left.points >= right.points) {
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
        System.out.println("Klasemen Proliga Voli Indonesia tahun 2022:");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("| %-4s | %-17s | %-9s | %-6s | %-6s | %-6s |\n", "Rank", "\t\tTim", "Game", "Menang", "Kalah", "Poin");
        System.out.println("-------------------------------------------------------------------------------");
        Team current = head;
        int rank = 1;
        while (current != null) {
            System.out.printf("| %-4d | %-30s | %-9d | %-6d | %-6d | %-6d |\n",
                    rank, current.nama, current.matchesPlayed, current.wins, current.losses, current.points);
            current = current.next;
            rank++;
        }
        System.out.println("-------------------------------------------------------------------------------");
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
