import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        League league = new League();

        // Menambahkan tim-tim
        league.addTeam("Bogor Lavani");
        league.addTeam("Jakarta BNI 46");
        league.addTeam("Jakarta Pertamina Pertamax");
        league.addTeam("Kudus Sukun Badak");
        league.addTeam("Palembang Bank Sumsel Babel");
        league.addTeam("Surabaya Bhayangkara Samator");

        // Memperbarui hasil pertandingan
        // Pekan 1 (7-8 Januari)
        league.updateResult("Palembang Bank Sumsel Babel", "Surabaya Bhayangkara Samator", 1, 3);
        league.updateResult("Kudus Sukun Badak", "Bogor Lavani", 1, 3);
        league.updateResult("Jakarta BNI 46", "Jakarta Pertamina Pertamax", 0, 3);
        league.updateResult("Kudus Sukun Badak", "Surabaya Bhayangkara Samator", 1, 3);

        // Pekan 2 (14-16 Januari)
        league.updateResult("Surabaya Bhayangkara Samator", "Jakarta BNI 46", 2, 3);
        league.updateResult("Palembang Bank Sumsel Babel", "Jakarta Pertamina Pertamax", 1, 3);
        league.updateResult("Bogor Lavani", "Jakarta Pertamina Pertamax", 1, 3);

        // Pekan 3 (21-23 Januari)
        league.updateResult("Kudus Sukun Badak", "Jakarta Pertamina Pertamax", 3, 0);
        league.updateResult("Surabaya Bhayangkara Samator", "Bogor Lavani", 3, 2);

        // Mengurutkan dan menampilkan klasemen
        league.sortTeams();
        league.printStandings();

        // Menampilkan pemain terbaik
        league.printBestPlayers();
    }
}